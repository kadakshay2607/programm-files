package com.te.JpaWithNet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.JpaWithNet.bean.Movies;

public class ReadData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager manager = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
			manager = entityManagerFactory.createEntityManager();
			
			Movies movies = manager.find(Movies.class, 200);
			Movies movies2 = manager.getReference(Movies.class, 500);
			System.out.println(movies.getId());
			System.out.println(movies.getName());
			System.out.println(movies.getGenre());
			System.out.println(movies.getRatings());
			System.out.println(movies2);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
