package com.example.onetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	@EntityGraph(attributePaths = "employees")
	List<Department> findAll();
}
