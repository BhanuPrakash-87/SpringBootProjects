package com.example.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.dto.DepartmentRequest;
import com.example.onetomany.entity.Department;
import com.example.onetomany.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/create")
	public Department createDepartment (@RequestBody DepartmentRequest request) {
		return service.createDepartment(request);
	}
	
	@GetMapping("/getList")
	public List<Department> getDepartments () {
		return service.getDepartments();
	}
}
