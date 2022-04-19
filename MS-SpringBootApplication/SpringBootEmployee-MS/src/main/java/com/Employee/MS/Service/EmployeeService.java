package com.Employee.MS.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Employee.MS.Model.Employee;
import com.Employee.MS.Repo.EmployeeRepo;
import com.Employee.MS.Vo.Department;
import com.Employee.MS.Vo.ResponseTemplateVo;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Autowired
	private RestTemplate restTemplate;

	public Employee addEmployee(Employee employee) {
		return repo.save(employee);

	}

	public ResponseTemplateVo getEmployeeById(long empId) {
	
		ResponseTemplateVo vo = new ResponseTemplateVo();
		
		Employee employee = repo.findByEmployeeId(empId);

		Department department = restTemplate.getForObject(
				"http://DEPARTMENT-MICROSERVICE/department/getDepartmentById/" + employee.getDepartmentId(), Department.class);
		vo.setEmployee(employee);
		vo.setDepartment(department);

		return vo;

	}

}
