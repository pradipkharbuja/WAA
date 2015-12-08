package com.packt.webstore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	// Using Declared Query Example
	@Query("SELECT e FROM Employee e WHERE id = :employeeId")
	Employee locateOneEmployeeByHisNumber(@Param("employeeId") int id);

	// Class Example
	// Employee getEmployeeById(int id);
}
