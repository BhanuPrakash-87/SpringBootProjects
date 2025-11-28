package com.example.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.dto.DepartmentRequest;
import com.example.onetomany.entity.Department;
import com.example.onetomany.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository depRepo;
	
	@Override
	public Department createDepartment(DepartmentRequest request) {
		return depRepo.save(request.getDepartment());
	}
	
	@Override
	public List<Department> getDepartments() {
		return depRepo.findAll();
	}
}
