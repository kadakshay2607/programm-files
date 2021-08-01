package com.te.empapp.dao;


import java.util.List;

import com.te.empapp.dto.EmployeeInfo;

public interface EmployeeDAO {
	
	public EmployeeInfo authenticate(int id , String pwd);
	
	public EmployeeInfo getData(int id);
	
	public boolean deleteData(int id);
	
	public boolean addData(EmployeeInfo employeeInfo) ;
	
	public boolean updateData(EmployeeInfo employeeInfo);
	
	public List<EmployeeInfo> getAllEmployees();
	
	
	


}
