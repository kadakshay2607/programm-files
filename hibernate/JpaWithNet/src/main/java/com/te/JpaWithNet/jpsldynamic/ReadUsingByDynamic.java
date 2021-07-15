package com.te.JpaWithNet.jpsldynamic;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.JpaWithNet.bean.Movies;

public class ReadUsingByDynamic {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id ");
        int ide = scanner.nextInt();
		try {
			factory = Persistence.createEntityManagerFactory("moviesData");
			manager = factory.createEntityManager();

			String queryread ="from Movies where id = :id";
			Query query = manager.createQuery(queryread);
			query.setParameter("id",ide);
			Movies mo = (Movies) query.getSingleResult();
			System.out.println(mo.getId());
			System.out.println(mo.getName());
			System.out.println(mo.getGenre());
			System.out.println(mo.getRatings());
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (factory!=null) {
				factory.close();
			}if (manager!=null) {
				manager.close();
			}
			scanner.close();
		}

	}
}

