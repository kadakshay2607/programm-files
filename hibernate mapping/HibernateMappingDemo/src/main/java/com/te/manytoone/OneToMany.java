package com.te.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.HibernateMappingDemo.bean.Cart;

public class OneToMany {

	public static void main(String[] args) {

		Cart cart = new Cart();
		cart.setCid(10);
		cart.setCname("tom");
		
		Product product = new Product();
		product.setPid(10);
		product.setPname("mobile");
		
		product.setCart(cart);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction entityTransaction = null;
		
		
		try {
			factory = Persistence.createEntityManagerFactory("mapData");
			manager = factory.createEntityManager();
			entityTransaction = manager.getTransaction();
			entityTransaction.begin();
			
			manager.persist(product);
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
