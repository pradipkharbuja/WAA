package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.Employee;
import mum.edu.repository.EmployeeRepository;
import mum.edu.service.EmployeeService;

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
