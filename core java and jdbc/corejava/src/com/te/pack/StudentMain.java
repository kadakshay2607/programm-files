package com.te.pack;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(2,"john"));
        arrayList.add(new Student(1,"jame"));
        arrayList.add(new Student(3,"scott"));
        
        for (Student student : arrayList) {
			System.out.println(student);
		}

        Collections.sort(arrayList);
        for (Student student : arrayList) {
			System.out.println(student);
		}
        

	}

}
