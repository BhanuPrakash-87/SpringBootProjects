package com.example.onetomany.dto;

import com.example.onetomany.entity.Department;

public class DepartmentRequest {

	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
