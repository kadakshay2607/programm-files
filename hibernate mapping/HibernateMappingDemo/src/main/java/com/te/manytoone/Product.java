package com.te.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.te.HibernateMappingDemo.bean.Cart;

import lombok.Data;

@Data
@Entity
@Table(name="prod_info")
public class Product {
	
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	private Cart cart;

}
