package mum.edu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	// Using Declared Query Example
	@Query("SELECT e FROM Employee e WHERE employeeNumber = :number")
	Employee locateOneEmployeeByHisNumber(@Param("number") int id);

	// Class Example
	// Employee getEmployeeById(int id);
}
