package com.te.empapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.empapp.dto.EmployeeInfo;
import com.te.empapp.exception.EmployeeException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeeInfo authenticate(int id, String password) {

		EntityManager manager = factory.createEntityManager();

		EmployeeInfo info = manager.find(EmployeeInfo.class, id);

		if (info != null) {

			if (info.getPassword().equals(password)) {

				return info;
			} else {
				System.out.println("Invalid password exception handled");
				throw new EmployeeException("Incorrect password");
			}
		} else {

			System.out.println("Invalid id exception handled");
			throw new EmployeeException("Invalid id");
		}
	}

	@Override
	public EmployeeInfo getData(int id) {

		EntityManager manager = factory.createEntityManager();

		EmployeeInfo info = manager.find(EmployeeInfo.class, id);
		return info;
	}

	@Override
	public boolean deleteData(int id) {

		boolean isDeleted = false;
		EntityTransaction transaction = null;
		try {
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			EmployeeInfo info = manager.find(EmployeeInfo.class, id);
			manager.remove(info);

			transaction.commit();

			isDeleted = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isDeleted;

	}

	@Override
	public boolean addData(EmployeeInfo employeeInfo) {

		boolean isAdded = false;
		EntityTransaction transaction = null;
		try {
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			manager.persist(employeeInfo);

			transaction.commit();

			isAdded = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isAdded;

	}

	@Override
	public boolean updateData(EmployeeInfo employeeInfo) {

		boolean isUpdated = false;
		EntityTransaction transaction = null;

		try {
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			EmployeeInfo info = manager.find(EmployeeInfo.class, employeeInfo.getId());

			System.out.println(info);

			if (employeeInfo.getName() != null && employeeInfo.getName() != "") {
				info.setName(employeeInfo.getName());
			}
			if (employeeInfo.getDob() != null) {
				info.setDob(employeeInfo.getDob());
			}
			if (employeeInfo.getPassword() != null && employeeInfo.getPassword() != "") {
				info.setPassword(employeeInfo.getPassword());
			}

			transaction.commit();
			isUpdated = true;

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return isUpdated;
	}

	@Override
	public List<EmployeeInfo> getAllEmployees() {

		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("from EmployeeInfo");

		ArrayList<EmployeeInfo> list = (ArrayList<EmployeeInfo>) query.getResultList();

		return list;
	}

}
