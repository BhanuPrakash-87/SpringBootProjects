package com.example.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	// "mappedBy" indicates that the foreign key mapping is managed by the "owning" side
	// If not, both entities might attempt to manage the relationship independently,
	// leading to duplicate foreign key columns or extra join tables
	// "orphanRemoval" automatically deletes child entities from the database when they are removed from their parent's collection
	
	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL, orphanRemoval = true) // Working
	@JoinColumn(name = "fk_department_id", referencedColumnName = "id", nullable = false) // Working
	//@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true) // not working
	//@JsonManagedReference
	private List<Employee> employees = new ArrayList<Employee>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
