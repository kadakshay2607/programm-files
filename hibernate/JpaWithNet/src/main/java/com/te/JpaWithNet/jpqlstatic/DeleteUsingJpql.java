package com.te.JpaWithNet.jpqlstatic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteUsingJpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager manager = null;
		EntityTransaction transaction  = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			String update = "delete from Movies where id = 200";
			Query query = manager.createQuery(update);
			int result = query.executeUpdate();

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction!=null) {
				transaction.rollback();
			}
		}
		finally {
			if (entityManagerFactory!=null) {
				entityManagerFactory.close();
			}
			if (manager!=null) {
				manager.close();
			}
		}


	}

}
