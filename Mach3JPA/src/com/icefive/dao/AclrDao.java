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

import com.icefive.model.bean.ACLRReport;
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
	
	public List<TbCclimitRev> findForReport(int maxRow, String appNo, Integer qid, Date submissionDate){
		EntityManager em = getEMF().createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ACLRReport> cq = cb.createQuery(ACLRReport.class);
		Root<TbCclimitRev> clr=  cq.from(TbCclimitRev.class);
		Expression whereClause =genFilter(cb, clr, appNo, qid, submissionDate);
		cq.multiselect(clr.get("clrPrmid"),cb.count(clr)).where(whereClause).groupBy(clr.get("clrPrmid"));
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
	
	
	

}
