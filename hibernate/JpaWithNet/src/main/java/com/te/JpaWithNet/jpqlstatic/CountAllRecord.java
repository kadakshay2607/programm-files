package com.te.JpaWithNet.jpqlstatic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountAllRecord {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("moviesData");
			manager = factory.createEntityManager();
			
			String count ="Select count(*) from Movies";
			Query query = manager.createQuery(count);
			Object obj = query.getSingleResult();
			System.out.println(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (factory!=null) {
				factory.close();
			}if (manager!=null) {
				manager.close();
			}
		}
		

	}

}
