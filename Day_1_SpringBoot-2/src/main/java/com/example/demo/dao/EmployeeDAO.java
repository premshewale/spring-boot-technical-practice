package com.example.demo.dao;

import com.example.demo.bean.Employee;

public interface EmployeeDAO {

	public int addEmployee(Employee emp); 
		
	public int updateEmployee(Employee emp);
	public int deleteEmployee(Employee emp);

}
