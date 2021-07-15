package com.te.HibernateMappingDemo.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name="lap_info")
public class Laptop implements Serializable{
	
	@Id
	@Column
	private int lid;
	@Column
	private String lname;

	@Exclude  // use the tostring of laptop and avoid the tostring of employee class
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")// create the foreign key 
	private Employee employee;

}
