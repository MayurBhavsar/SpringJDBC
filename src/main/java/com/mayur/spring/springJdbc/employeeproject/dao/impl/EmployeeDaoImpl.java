package com.mayur.spring.springJdbc.employeeproject.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mayur.spring.springJdbc.employeeproject.dao.EmployeeDao;
import com.mayur.spring.springJdbc.employeeproject.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(int id, String fname) {
		String sql = "UPDATE employee SET firstName=? WHERE id=?";
		int result = jdbcTemplate.update(sql,fname,id);
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM employee WHERE id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

}
