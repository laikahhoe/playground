package com.icefive.dao;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.icefive.model.db.jpa.common.TbCclimitRev;

public class AclrDao {
	private static EntityManagerFactory emf = null;

	public EntityManagerFactory getEMF (){
	    if (emf == null){
	        emf = Persistence.createEntityManagerFactory("Mach3JPA");
	    }
	    return emf;
	}
	
	public List<TbCclimitRev> findAllCClimitRev(int maxRow){
		EntityManager em = getEMF().createEntityManager();
		Query q = em.createNamedQuery("TbCclimitRev.findAll",TbCclimitRev.class);
		q.setMaxResults(maxRow);
		return q.getResultList();	
	}
	
	public List<TbCclimitRev> findAllCClimitRev(int maxRow, Timestamp submittedDate){
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
