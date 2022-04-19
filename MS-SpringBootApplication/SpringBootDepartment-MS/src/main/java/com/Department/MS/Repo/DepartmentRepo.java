package com.Department.MS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Department.MS.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	Department findByDepartmentId(int departmentId);

}
