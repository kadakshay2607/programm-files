package com.te.JpaWithNet.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="movies_info")
public class Movies implements Serializable {

	@Id
	@Column (name="m_id")
	private int id;
	@Column (name="m_name")
	private String name;
	@Column (name="m_genre")
	private String genre;
	@Column (name="m_ratings")
	private double ratings;
	
	public Movies() {
		super();
	}

	
	
		
}
