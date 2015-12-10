package mum.edu.service;

import mum.edu.domain.Employee;

public interface EmployeeService {
	Iterable<Employee> getAllEmployees();

	Employee getEmployeeByNumber(int id);

	void addNewEmployee(Employee employee);
	
}
