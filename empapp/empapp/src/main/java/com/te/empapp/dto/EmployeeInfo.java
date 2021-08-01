package com.te.empapp.dto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "emp_info")
public class EmployeeInfo implements Serializable {

	@Id
	private Integer id;
	@Column
	private String name;

	@Column
	private Date dob;
	@Column
	private String password;

}
