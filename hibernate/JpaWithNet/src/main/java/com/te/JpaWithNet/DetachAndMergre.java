package com.te.JpaWithNet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.JpaWithNet.bean.Movies;

public class DetachAndMergre {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager manager = null;
		EntityTransaction transaction  = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			Movies movies = manager.find(Movies.class, 300);
			System.out.println(manager.contains(movies));//true
			manager.detach(movies);
			System.out.println(manager.contains(movies));//false
			
			Movies movies2 = manager.merge(movies);
			System.out.println(manager.contains(movies2));
          

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


