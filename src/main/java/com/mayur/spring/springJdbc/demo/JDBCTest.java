package com.mayur.spring.springJdbc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/spring/springJdbc/demo/config.xml");
	
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "delete from employee where id=?";
		int result = template.update(sql,1);
		System.out.println(result);
		((AbstractApplicationContext) context).close();
	}

}
