package com.te.empapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.empapp.dao.EmployeeDAO;
import com.te.empapp.dto.EmployeeInfo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeInfo authenticate(int id, String pwd) {

		if (id <= 0) {

			return null;
		} else {

			return dao.authenticate(id, pwd);
		}
	}

	@Override
	public EmployeeInfo getData(int id) {

		if (id <= 0) {

			return null;
		} else {

			return dao.getData(id);
		}

	}

	@Override
	public boolean deleteData(int id) {
		
		if (id <= 0) {

			return false;
		} else {

			return dao.deleteData(id);
		}
	}

	@Override
	public boolean addData(EmployeeInfo employeeInfo) {
		
		return dao.addData(employeeInfo);
	}

	@Override
	public boolean updateData(EmployeeInfo employeeInfo) {
		
		return dao.updateData(employeeInfo);
	}

	@Override
	public List<EmployeeInfo> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}
	

}
