package com.Employee.MS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.MS.Model.Employee;

//@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	 Employee findByEmployeeId(long empId) ;
		
	

	



	

}
