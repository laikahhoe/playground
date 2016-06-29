package com.icefive.dao;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import com.icefive.model.bean.ACLRAutoDeclineReport;
import com.icefive.model.bean.ACLRMovementReport;
import com.icefive.model.bean.ACLRReport;
import com.icefive.model.bean.ACLRStaffReport;
import com.icefive.model.db.jpa.common.TbCclimitRev;

public class AclrDao {
	private static EntityManagerFactory emf = null;

	public EntityManagerFactory getEMF (){
	    if (emf == null){
	        emf = Persistence.createEntityManagerFactory("Mach3JPA");
	    }
	    return emf;
	}
	
	public TbCclimitRev get(String id){
		EntityManager em = getEMF().createEntityManager();
		TbCclimitRev result = em.find(TbCclimitRev.class, id);
		return result;	
	}
	
	public List<TbCclimitRev> findAllCClimitRev(int maxRow){
		EntityManager em = getEMF().createEntityManager();
		Query q = em.createNamedQuery("TbCclimitRev.findAll",TbCclimitRev.class);
		q.setMaxResults(maxRow);
		return q.getResultList();	
	}
	
	public Long countAllCCLimitRev(String appNo, Integer qid, Date submissionDate){
		EntityManager em = getEMF().createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		//for return result
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		Root<TbCclimitRev> clr=  cq.from(TbCclimitRev.class);
		Expression whereClause =genFilter(cb, clr, appNo, qid, submissionDate);
		cq.multiselect(cb.count(clr.<String>get("clrAppno"))).where(whereClause);
		Query q =em.createQuery(cq);
		if(appNo!=null){
			q.setParameter("clrAppno", appNo+"%");
		}
		if(qid!=null){
			q.setParameter("clrPrmid", qid);
		}
		if(submissionDate!=null){
			Calendar c1 = new GregorianCalendar();
			c1.setTime(submissionDate);
			c1.set(Calendar.HOUR, 0);
			c1.set(Calendar.MINUTE, 0);
			c1.set(Calendar.SECOND, 0);
			c1.set(Calendar.MILLISECOND, 0);
			Calendar c2 = (Calendar)c1.clone();
			c2.add(Calendar.DATE, 1);
			
			q.setParameter("clrSubmittedDateFrom", c1.getTime());
			q.setParameter("clrSubmittedDateTo", c2.getTime());
		}
		return (Long)q.getSingleResult();	
	}
	
	public Expression genFilter(CriteriaBuilder cb,Root<TbCclimitRev> clr,String appNo, Integer qid, Date submissionDate){
		Expression whereClause = null;
		
		if(appNo!=null){
			ParameterExpression<String> p = cb.parameter(String.class,"clrAppno");
			Expression ex  = cb.like(clr.<String>get("clrAppno"), p);
			if(whereClause!=null){
				whereClause = cb.and(whereClause,ex);
			}else{
				whereClause = ex;
			}
		}
		
		if(qid!=null){
			ParameterExpression<Integer> p = cb.parameter(Integer.class,"clrPrmid");
			Expression ex  = cb.equal(clr.<Integer>get("clrPrmid"), p);
			if(whereClause!=null){
				whereClause = cb.and(whereClause,ex);
			}else{
				whereClause = ex;
			}
		}
		
		if(submissionDate!=null){
			ParameterExpression<Date> p = cb.parameter(Date.class,"clrSubmittedDateFrom");
			ParameterExpression<Date> p2 = cb.parameter(Date.class,"clrSubmittedDateTo");
			Expression ex  = cb.between(clr.<Date>get("clrSubmittedDate"), p,p2);
			if(whereClause!=null){
				whereClause = cb.and(whereClause,ex);
			}else{
				whereClause = ex;
			}
		}
		return whereClause;
	}
	
	public List<TbCclimitRev> findAllCClimitRev(int maxRow, String appNo, Integer qid, Date submissionDate){
		EntityManager em = getEMF().createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<TbCclimitRev> cq = cb.createQuery(TbCclimitRev.class);
		Root<TbCclimitRev> clr=  cq.from(TbCclimitRev.class);
		Expression whereClause =genFilter(cb, clr, appNo, qid, submissionDate);
		cq.select(clr).where(whereClause);
		Query q =em.createQuery(cq);
		if(appNo!=null){
			q.setParameter("clrAppno", appNo+"%");
		}
		if(qid!=null){
			q.setParameter("clrPrmid", qid);
		}
		if(submissionDate!=null){
			Calendar c1 = new GregorianCalendar();
			c1.setTime(submissionDate);
			c1.set(Calendar.HOUR, 0);
			c1.set(Calendar.MINUTE, 0);
			c1.set(Calendar.SECOND, 0);
			c1.set(Calendar.MILLISECOND, 0);
			Calendar c2 = (Calendar)c1.clone();
			c2.add(Calendar.DATE, 1);
			
			q.setParameter("clrSubmittedDateFrom", c1.getTime());
			q.setParameter("clrSubmittedDateTo", c2.getTime());
		}
		q.setMaxResults(maxRow);
		return q.getResultList();	
	}
	
	public List<ACLRStaffReport> findForStaffReport(Date submissionDate){
		EntityManager em = getEMF().createEntityManager();
		Query query = em.createNativeQuery(
				" select H.PJH_JUDGEDBY, "
				+ " U.USER_NAME,"
				+ " C.NMCD_NAME AS JUDGE_ACTION, "
				+ " COUNT(*) AS TOTAL from COMMON.TB_CCLIMIT_REV R  " 
				+ " INNER JOIN ASSESSMENT.TB_PREJUDGEHIST H "
				+ " ON H.PJH_APPNO = R.CLR_APPNO "
				+ " INNER JOIN COMMON.TB_USER U "
				+ " ON U.USER_USERID = H.PJH_JUDGEDBY "
				+ " INNER JOIN MASTER.TBM_NAMECODE C "
				+ " ON C.NMCD_VALUE = H.PJH_JUDGESTATUS "
				+ " AND C.NMCD_NMCDCODE = 'AS07' "
				+ " WHERE  DATE(PJH_JUDGEDDATE) = ? " 
				+ " GROUP BY H.PJH_JUDGEDBY, U.USER_NAME,C.NMCD_NAME ORDER BY H.PJH_JUDGEDBY ASC ","QueueStaffReport");
	    query.setParameter(1, submissionDate,TemporalType.DATE);
		List<ACLRStaffReport> result= query.getResultList();
		return result;
	}
	
	public List<ACLRReport> findForReportPrevDay(int maxRow, String appNo, Integer qid, Date submissionDate){
		EntityManager em = getEMF().createEntityManager();
		Query query = em.createNativeQuery("select R.CLR_PRMID, QPRM_QNAME, count(*) as TOTAL "
				+ "from COMMON.TB_CCLIMIT_REV R"
				+ " inner join MASTER.TBM_QPARAM Q"
				+ " on Q.QPRM_QPRMID = R.CLR_PRMID"
				+ " WHERE DATE(CLR_SUBMITTED_DATE) = (CURRENT DATE - 1 DAYS) GROUP BY CLR_PRMID, QPRM_QNAME",  "QueueReport");
		List<ACLRReport> result= query.getResultList();
		return result;
	}
	
	public List<ACLRReport> findForReport(int maxRow, String appNo, Integer qid, Date submissionDate){
		EntityManager em = getEMF().createEntityManager();
		Query query = em.createNativeQuery("select R.CLR_PRMID, QPRM_QNAME, count(*) as TOTAL "
				+ "from COMMON.TB_CCLIMIT_REV R"
				+ " inner join MASTER.TBM_QPARAM Q"
				+ " on Q.QPRM_QPRMID = R.CLR_PRMID"
				+ " WHERE DATE(CLR_SUBMITTED_DATE) = ? GROUP BY CLR_PRMID, QPRM_QNAME",  "QueueReport");
		query.setParameter(1, submissionDate,TemporalType.DATE);
		List<ACLRReport> result= query.getResultList();
		
		return result;
		
//		EntityManager em = getEMF().createEntityManager();
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<ACLRReport> cq = cb.createQuery(ACLRReport.class);
//		Root<TbCclimitRev> clr=  cq.from(TbCclimitRev.class);
//		Expression whereClause =genFilter(cb, clr, appNo, qid, submissionDate);
//		cq.multiselect(clr.get("clrPrmid"),cb.count(clr)).where(whereClause).groupBy(clr.get("clrPrmid"));
//		Query q =em.createQuery(cq);
//		if(appNo!=null){
//			q.setParameter("clrAppno", appNo+"%");
//		}
//		if(qid!=null){
//			q.setParameter("clrPrmid", qid);
//		}
//		if(submissionDate!=null){
//			Calendar c1 = new GregorianCalendar();
//			c1.setTime(submissionDate);
//			c1.set(Calendar.HOUR, 0);
//			c1.set(Calendar.MINUTE, 0);
//			c1.set(Calendar.SECOND, 0);
//			c1.set(Calendar.MILLISECOND, 0);
//			Calendar c2 = (Calendar)c1.clone();
//			c2.add(Calendar.DATE, 1);
//			
//			q.setParameter("clrSubmittedDateFrom", c1.getTime());
//			q.setParameter("clrSubmittedDateTo", c2.getTime());
//		}
//		q.setMaxResults(maxRow);
//		return q.getResultList();	
	}
	
	public List<TbCclimitRev> findAllCClimitRevBySubmittedDate(int maxRow, Timestamp submittedDate){
		EntityManager em = getEMF().createEntityManager();
		Query q = em.createNamedQuery("TbCclimitRev.findAllBySubmittedDate",TbCclimitRev.class);
		Calendar c1 = new GregorianCalendar();
		c1.setTime(submittedDate);
		c1.set(Calendar.HOUR, 0);
		c1.set(Calendar.MINUTE, 0);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
		Calendar c2 = (Calendar)c1.clone();
		c2.add(Calendar.DATE, 1);
		
		q.setParameter("clrSubmittedDateStartTime", c1.getTime());
		q.setParameter("clrSubmittedDateEndTime", c2.getTime());
		q.setMaxResults(maxRow);
		return q.getResultList();	
	}
	
	
	public List findForMovementReport(){
		StringBuffer sb = new StringBuffer();
		sb.append("select D, SUM(TOT_NEW)  AS NEW,SUM(TOT_SUBMIT) AS SUBMITTED, SUM(TOT_PRE) AS PREAPPROVED, SUM(TOT_FINAL) AS FINALJUDGE from ( ");
		sb.append("	select DATE(CLR_SUBMITTED_DATE) AS D, count(*) AS TOT_SUBMIT, 0 AS TOT_PRE, 0 AS TOT_FINAL, 0 AS TOT_NEW from COMMON.TB_CCLIMIT_REV GROUP BY DATE(CLR_SUBMITTED_DATE) ");
		sb.append("	UNION ALL ");
		sb.append("	select DATE(CLR_PREJUDGED_DATE) AS D, 0 AS TOT_SUBMIT, count(*) AS TOT_PRE, 0 AS TOT_FINAL, 0 AS TOT_NEW from COMMON.TB_CCLIMIT_REV GROUP BY DATE(CLR_PREJUDGED_DATE) ");
		sb.append("	UNION ALL ");
		sb.append("	select DATE(CLR_FINALJUDGED_DATE) AS D, 0 AS TOT_SUBMIT, 0 AS TOT_PRE, count(*) AS TOT_FINAL, 0 AS TOT_NEW from COMMON.TB_CCLIMIT_REV GROUP BY DATE(CLR_FINALJUDGED_DATE) ");
		sb.append("	UNION ALL  ");
		sb.append("	select DATE(CLR_CREATED_DATE) AS D, 0 AS TOT_SUBMIT, 0 AS TOT_PRE, 0 AS TOT_FINAL, count(*) AS TOT_NEW from COMMON.TB_CCLIMIT_REV GROUP BY DATE(CLR_CREATED_DATE) ");
		sb.append("	)TEMP  GROUP BY D ORDER BY D ASC ");
		EntityManager em = getEMF().createEntityManager();
		Query query = em.createNativeQuery(sb.toString(),"ACLRMovementReport");
		List<ACLRMovementReport> result= query.getResultList();
		return result;
	}
	
	
	public List findForAutoDeclineReport(Date submissionDate){
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT TEMP.CLR_APPNO, RPT_OUT.QFR_REMARK FROM (");
		sb.append(" select CLR_APPNO, MAX(RPT.QFR_SEQ)AS SEQ, MAX(RPT.QFR_SUBSEQ)AS  SUBSEQ from COMMON.TB_CCLIMIT_REV R");
		sb.append(" INNER JOIN FB_CHECKING.TB_QFLOWRPT RPT");
		sb.append(" ON R.CLR_APPNO = RPT.QFR_APPNO ");
		sb.append(" WHERE DATE(CLR_PREJUDGED_DATE) = ?");
		sb.append(" AND CLR_STATUS = 'D'");
		sb.append(" AND CLR_FINALJUDGED_BY = 'SYSTEM'");
		sb.append(" GROUP BY CLR_APPNO ");
		sb.append(" )TEMP ");
		sb.append(" INNER JOIN COMMON.TB_CCLIMIT_REV R_OUT");
		sb.append(" ON R_OUT.CLR_APPNO = TEMP.CLR_APPNO");
		sb.append(" INNER JOIN FB_CHECKING.TB_QFLOWRPT RPT_OUT");
		sb.append(" ON RPT_OUT.QFR_SEQ = TEMP.SEQ");
		sb.append(" AND RPT_OUT.QFR_SUBSEQ = TEMP.SUBSEQ");
		sb.append(" AND RPT_OUT.QFR_APPNO = TEMP.CLR_APPNO");
		
		EntityManager em = getEMF().createEntityManager();
		Query query = em.createNativeQuery(sb.toString(),"ACLRAutoDeclineReport");
		query.setParameter(1, submissionDate,TemporalType.DATE);
		List<ACLRAutoDeclineReport> result= query.getResultList();
		return result;
	}
	

}
