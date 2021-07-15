package com.te.HibernateMappingDemo.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.te.manytoone.Product;

import lombok.Data;

@Entity
@Data
@Table(name="cart_info")
public class Cart implements Serializable {
	
	@Id
	@Column
	private int cid;
	
	@Column
	private String cname;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
	private List<Product> product;

	public Cart() {
		super();
	}
	

}
