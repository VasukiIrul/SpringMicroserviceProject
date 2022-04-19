package com.Employee.MS.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
	private int departmentId;
	private String departmentName;
	private String departmentAddress;
}
