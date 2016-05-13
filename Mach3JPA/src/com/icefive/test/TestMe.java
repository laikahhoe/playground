package com.icefive.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.icefive.dao.AclrDao;
import com.icefive.model.db.jpa.common.TbCclimitRev;

public class TestMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestMe dao = new TestMe();
//		EntityManager em = dao.getEMF().createEntityManager();
//		Query q = em.createNamedQuery("TbCclimitRev.findAll",TbCclimitRev.class);
//		q.setMaxResults(10);
		//List<TbCclimitRev> list = q.getResultList();
		AclrDao dao = new AclrDao();
		List<TbCclimitRev> list = dao.findAllCClimitRev(10);
		for(TbCclimitRev app:list){
			System.out.println("app : " + app.getClrAppno());
		}
	}
	
	private static EntityManagerFactory emf = null;
	
	public EntityManagerFactory getEMF (){
	    if (emf == null){
	        emf = Persistence.createEntityManagerFactory("Mach3JPA");
	    }
	    return emf;
	}

}
