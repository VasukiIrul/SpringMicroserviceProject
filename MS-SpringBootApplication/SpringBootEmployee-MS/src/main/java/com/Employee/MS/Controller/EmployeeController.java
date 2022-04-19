package com.Employee.MS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.MS.Model.Employee;
import com.Employee.MS.Service.EmployeeService;
import com.Employee.MS.Vo.ResponseTemplateVo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee employeeObj = employeeService.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeObj, HttpStatus.OK);
	}

	@GetMapping("/getEmployeeById/{id}")

	public ResponseEntity<ResponseTemplateVo> getEmployeeById(@PathVariable("id") long empId) {
		ResponseTemplateVo vo = employeeService.getEmployeeById(empId);
		return new ResponseEntity<>(vo, HttpStatus.OK);
	}
}
