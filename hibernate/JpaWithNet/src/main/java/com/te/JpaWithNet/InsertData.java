package com.te.JpaWithNet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.JpaWithNet.bean.Movies;

public class InsertData {

	public static void main(String[] args) {

		Movies movies = new Movies();
		movies.setId(100);
		movies.setName("tenet");
		movies.setGenre("action");
		movies.setRatings(5.3);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager manager = null;
		EntityTransaction transaction  = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			manager.persist(movies);
			System.out.println("data inserted sucessfully");

			transaction.commit();
		} catch (Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
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
