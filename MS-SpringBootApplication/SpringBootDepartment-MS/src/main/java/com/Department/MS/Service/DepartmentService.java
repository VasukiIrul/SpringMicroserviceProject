package com.Department.MS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.MS.Repo.DepartmentRepo;
import com.Department.MS.model.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;

	public Department addDepartment(Department department) {
		return departmentRepo.save(department);

	}

	public Department getDepartmentById(int departmentId) {
		return departmentRepo.findByDepartmentId(departmentId);

	}

}
