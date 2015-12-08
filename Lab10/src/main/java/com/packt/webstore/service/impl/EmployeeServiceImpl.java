package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
import com.packt.webstore.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> getAllEmployees() {		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByNumber(int id) {		
		return employeeRepository.locateOneEmployeeByHisNumber(id);
	}

	@Override
	public void addNewEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
