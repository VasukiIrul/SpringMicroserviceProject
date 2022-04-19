package com.Employee.MS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	@Id
	private long employeeId;
	private String name;
	private String city;
	private int departmentId;
	
}
