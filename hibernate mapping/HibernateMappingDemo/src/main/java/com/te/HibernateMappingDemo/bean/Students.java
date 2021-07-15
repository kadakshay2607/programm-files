package com.te.HibernateMappingDemo.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="stud_info")
public class Students implements Serializable{
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Exclude
	@JoinTable(name = "std",joinColumns = @JoinColumn(name="sid"),inverseJoinColumns = @JoinColumn (name="cid"))
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Courses> courses;
	public Students() {
		super();
	}
	
	

}
