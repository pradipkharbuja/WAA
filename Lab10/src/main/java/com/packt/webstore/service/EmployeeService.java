package com.packt.webstore.service;

import com.packt.webstore.domain.Employee;

public interface EmployeeService {
	Iterable<Employee> getAllEmployees();

	Employee getEmployeeByNumber(int id);

	void addNewEmployee(Employee employee);
	
}
