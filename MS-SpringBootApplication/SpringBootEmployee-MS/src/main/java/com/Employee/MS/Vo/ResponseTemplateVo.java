package com.Employee.MS.Vo;

import com.Employee.MS.Model.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseTemplateVo {

	private Department department;
	private Employee employee;
}
