package com.te.JpaWithNet.jpqlstatic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class ReadUsingJpql {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("moviesData");
			manager = factory.createEntityManager();

			String count ="Select name from Movies";
			Query query = manager.createQuery(count);
			java.util.List obj = query.getResultList();
			obj.forEach(var -> System.out.println("movie name is a"+var));

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
