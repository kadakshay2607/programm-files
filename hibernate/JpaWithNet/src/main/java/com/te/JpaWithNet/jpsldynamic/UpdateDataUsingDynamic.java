package com.te.JpaWithNet.jpsldynamic;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDataUsingDynamic {

	
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory = null;
			EntityManager manager = null;
			EntityTransaction transaction  = null;
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the name");
			String namee = scanner.nextLine();
			System.out.println("enter the id");
			int ide = scanner.nextInt();
			try {
				entityManagerFactory = Persistence.createEntityManagerFactory("moviesData");
				manager = entityManagerFactory.createEntityManager();
				transaction = manager.getTransaction();
				transaction.begin();

				String update = "update Movies set name= :name where id = :id";
				Query query = manager.createQuery(update);
				query.setParameter("name", namee);
				query.setParameter("id", ide);
				int result = query.executeUpdate();
				System.out.println("no of row aafected "+result);

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
				scanner.close();
			}
			


	}

}
