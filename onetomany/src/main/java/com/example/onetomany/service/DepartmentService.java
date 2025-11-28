package com.example.onetomany.service;

import java.util.List;

import com.example.onetomany.dto.DepartmentRequest;
import com.example.onetomany.entity.Department;

public interface DepartmentService {

	Department createDepartment(DepartmentRequest request);
	List<Department> getDepartments();
}
