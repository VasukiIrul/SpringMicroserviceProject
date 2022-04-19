package com.Department.MS.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

	@Id
	private int departmentId;
	private String departmentName;
	private String departmentAddress;
	
	
	
	
}
