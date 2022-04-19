package com.Department.MS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Department.MS.Service.DepartmentService;
import com.Department.MS.model.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/addDepartment")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
		Department departmentObj = departmentService.addDepartment(department);
		return new ResponseEntity<Department>(departmentObj, HttpStatus.OK);

	}

	@GetMapping("/getDepartmentById/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("id") int departmentId) {
		Department departmentObj =	departmentService.getDepartmentById(departmentId);
		return new ResponseEntity<Department>(departmentObj, HttpStatus.OK);
	}

}
