package com.mayur.spring.springJdbc.employeeproject.dao;

import com.mayur.spring.springJdbc.employeeproject.dto.Employee;

public interface EmployeeDao {

	int insert(Employee employee);
	int update(int id,String fname);
	int delete(int id);
}
