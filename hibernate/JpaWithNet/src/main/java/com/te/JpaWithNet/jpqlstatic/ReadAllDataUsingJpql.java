package com.te.JpaWithNet.jpqlstatic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.JpaWithNet.bean.Movies;

public class ReadAllDataUsingJpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager manager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
			manager = entityManagerFactory.createEntityManager();

			String readData = "from Movies";
			Query query = manager.createQuery(readData);
			List<Movies> list = query.getResultList();
			list.forEach(var -> System.out.println(var));

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
