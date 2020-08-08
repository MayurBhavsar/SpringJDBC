package com.mayur.spring.springJdbc.employeeproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mayur.spring.springJdbc.employeeproject.dao.EmployeeDao;
import com.mayur.spring.springJdbc.employeeproject.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/springJdbc/employeeproject/test/config.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Mayur");
		employee.setLastName("Bhavsar");
		int result = dao.insert(employee);
		System.out.println(result);
		
		result = dao.update(2, "Chhaya");
		System.out.println(result);
		
		result = dao.delete(1);
		System.out.println(result);
		((AbstractApplicationContext) context).close();
		
	}
}
