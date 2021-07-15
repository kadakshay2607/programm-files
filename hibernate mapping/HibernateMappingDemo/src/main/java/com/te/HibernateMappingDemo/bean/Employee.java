package com.te.HibernateMappingDemo.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name="emp_info")
public class Employee implements Serializable {

	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	
	@Exclude
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
	private Laptop laptop;
	
	public Employee() {
		super();
	}
	
	
}
