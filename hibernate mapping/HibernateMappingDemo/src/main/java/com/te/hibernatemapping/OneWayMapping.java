package com.te.hibernatemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.HibernateMappingDemo.bean.Employee;
import com.te.HibernateMappingDemo.bean.Laptop;

public class OneWayMapping {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEid(11);
		employee.setEname("tom");
		
		Laptop laptop = new Laptop();
		laptop.setLid(13);
		laptop.setLname("acer");
		
		laptop.setEmployee(employee);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction entityTransaction = null;
		
		
		try {
			factory = Persistence.createEntityManagerFactory("mapData");
			manager = factory.createEntityManager();
			entityTransaction = manager.getTransaction();
			entityTransaction.begin();
			
			manager.persist(laptop);
			System.out.println("Data updated sucessfully");
			entityTransaction.commit();
				
		} catch (Exception e) {
			if (entityTransaction!=null) {
				entityTransaction.rollback();
			}
			e.printStackTrace();
		}
		
		
	}

}
