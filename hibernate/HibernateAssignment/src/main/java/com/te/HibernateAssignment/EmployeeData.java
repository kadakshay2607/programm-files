package com.te.HibernateAssignment;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.HibernateAssignment.bean.Employee;





public class EmployeeData {

	Scanner scanner = new Scanner(System.in);
	EntityManagerFactory factory ;
	EntityManager manager ;
	EntityTransaction transaction;


	public void allData() {
		try {
			factory = Persistence.createEntityManagerFactory("employeeData");
			manager = factory.createEntityManager();
			String queryread ="from Employee";
			Query query = manager.createQuery(queryread);
			List a =  query.getResultList();
			for (Object object : a) {
				System.out.println(object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readData() {
		System.out.println("enter Empid ");
		int ide = scanner.nextInt();
		factory = Persistence.createEntityManagerFactory("employeeData");
		manager = factory.createEntityManager();
		String queryr ="Select empid from Employee";
		Query qu = manager.createQuery(queryr);
		List a =  qu.getResultList();
		if (a.contains(ide)) {
			try {
				factory = Persistence.createEntityManagerFactory("employeeData");
				manager = factory.createEntityManager();

				String queryread ="from Employee where empid = :empid";
				Query query = manager.createQuery(queryread);
				query.setParameter("empid",ide);
				List mo = query.getResultList();
				mo.forEach(var -> System.out.println(var));

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("please enter valid empid");
			readData();
		}
	}
	public void upData() {

		System.out.println("update Name press 1 /update Empno press 2 / update Empjoindate press 3");
		int ch = scanner.nextInt();
		try {
			factory = Persistence.createEntityManagerFactory("employeeData");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			if (ch == 1) {
				System.out.println("enter Name");
				String namee = scanner.next();
				scanner.nextLine();
				System.out.println("Enter Empid");
				int ide =scanner.nextInt();
				String update = "update Employee set empname= :empname where empid = :empid";
				Query query = manager.createQuery(update);
				query.setParameter("empname", namee);
				query.setParameter("empid", ide);
				int result = query.executeUpdate();
				System.out.println("Data Updated");
			}
			else if (ch == 2) {
				System.out.println("Enter Empid");
				int ide =scanner.nextInt();
				System.out.println("enter Empno");
				long empnoo = scanner.nextLong();

				String update = "update Employee set empno= :empno where empid = :empid";
				Query query = manager.createQuery(update);
				query.setParameter("empno", empnoo);
				query.setParameter("empid", ide);
				int result = query.executeUpdate();
				System.out.println("Data Updated");
			}
			else if (ch == 3) {

				System.out.println("enter EmpJoinDate");
				String sdate = scanner.next();
				System.out.println("Enter Empid");
				int ide =scanner.nextInt();

				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sdate);
				java.sql.Date date2 = new java.sql.Date(date.getTime());
				String update = "update Employee set joindate = : joindate where empid = : empid";
				Query query = manager.createQuery(update);
				query.setParameter("joindate", date2);
				query.setParameter("empid", ide);
				int result = query.executeUpdate();
				System.out.println("Data Updated");
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction!=null) {
				transaction.rollback();
			}
		}

	}
	public void delData() {

		System.out.println("enter the empid");
		int ide = scanner.nextInt();
		factory = Persistence.createEntityManagerFactory("employeeData");
		manager = factory.createEntityManager();
		String queryr ="Select empid from Employee";
		Query qu = manager.createQuery(queryr);
		List a =  qu.getResultList();
		if (a.contains(ide)) {
			try {
				factory = Persistence.createEntityManagerFactory("employeeData");
				manager = factory.createEntityManager();
				transaction = manager.getTransaction();
				transaction.begin();

				String update = "delete from Employee where empid = :empid";
				Query query = manager.createQuery(update);
				query.setParameter("empid", ide);
				int result = query.executeUpdate();
				System.out.println("Data Delete SucessFully");

				transaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (transaction!=null) {
					transaction.rollback();
				}
			}
		}
		else {
			System.out.println("Please enter valid empid");
			delData();
		}
	}
}
