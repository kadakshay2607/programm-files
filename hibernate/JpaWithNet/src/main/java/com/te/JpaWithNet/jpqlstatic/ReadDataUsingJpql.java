package com.te.JpaWithNet.jpqlstatic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.JpaWithNet.bean.Movies;



public class ReadDataUsingJpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager manager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
			manager = entityManagerFactory.createEntityManager();

			String readData = "from Movies where id = 600";
			Query query = manager.createQuery(readData);
			Movies movies=(Movies)query.getSingleResult();
			System.out.println(movies.getId());
			System.out.println(movies);

		} catch (Exception e) {
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
