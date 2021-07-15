package com.te.hibernatemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.HibernateMappingDemo.bean.Employee;
import com.te.HibernateMappingDemo.bean.Laptop;

public class TwoWayMapping {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEid(20);
		employee.setEname("philip");
		
		Laptop laptop = new Laptop();
		laptop.setLid(21);
		laptop.setLname("dell");
		
		employee.setLaptop(laptop);
		laptop.setEmployee(employee);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			
			factory = Persistence.createEntityManagerFactory("mapData");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			manager.persist(laptop);
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
		}
	}

}
