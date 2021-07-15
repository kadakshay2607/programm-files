package com.te.HibernateAssignment.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table (name="emp_info")
public class Employee implements Serializable {

	@Id
	private int empid;
	private String empname;
	private long empno;
	private String joindate;

	public Employee() {
		super();
	}
}
