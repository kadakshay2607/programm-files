package com.te.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.HibernateMappingDemo.bean.Courses;
import com.te.HibernateMappingDemo.bean.Students;

public class ManyToMany {

	public static void main(String[] args) {
		Students students = new Students();
		students.setSid(10);
		students.setSname("akshay");
		
		Students students2 = new Students();
		students2.setSid(11);
		students2.setSname("kiran");
		
		Courses courses = new Courses();
		courses.setCid(100);
		courses.setCname("java");
		
		Courses courses2 = new Courses();
		courses2.setCid(200);
		courses.setCname("python");
		
		ArrayList<Students> arrayList = new ArrayList<Students>();
		arrayList.add(students);
		arrayList.add(students2);
		
		ArrayList<Courses> arrayList2 = new ArrayList<Courses>();
		arrayList2.add(courses);
		arrayList2.add(courses2);
		
		courses.setStudents(arrayList);
		courses2.setStudents(arrayList);
		
		students.setCourses(arrayList2);
		students2.setCourses(arrayList2);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			
			factory = Persistence.createEntityManagerFactory("mapData");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(courses);
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
		}
	}

}
