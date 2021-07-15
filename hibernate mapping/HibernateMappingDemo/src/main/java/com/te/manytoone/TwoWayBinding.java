package com.te.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.HibernateMappingDemo.bean.Cart;

public class TwoWayBinding {

	public static void main(String[] args) {
		Product product = new Product();
		product.setPid(1);
		product.setPname("redmi");
		
		Product product2 = new Product();
		product2.setPid(2);
		product2.setPname("samsung");
		
		Cart cart = new Cart();
		cart.setCid(1);
		cart.setCname("first");
		
		product.setCart(cart);
		product2.setCart(cart);
		
		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList.add(product);
		arrayList.add(product2);
		
		cart.setProduct(arrayList);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction entityTransaction = null;
		
		
		try {
			factory = Persistence.createEntityManagerFactory("mapData");
			manager = factory.createEntityManager();
			entityTransaction = manager.getTransaction();
			entityTransaction.begin();
			manager.persist(cart);
			Cart cart2 = manager.find(Cart.class,1);
			
			Product product3 = new Product();
			product3.setPid(3);
			product3.setPname("real");
			
			Product product4 = new Product();
			product4.setPid(4);
			product4.setPname("one");
			
			product3.setCart(cart2);
			product4.setCart(cart2);
			
			List<Product> list = cart2.getProduct();
			list.add(product3);
			list.add(product4);
			
			cart2.setProduct(list);
			
			
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
