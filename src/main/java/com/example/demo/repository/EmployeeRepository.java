package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByName(String name);

	List<Employee> findByNameOrId(String name, int id);

	List<Employee> findByNameAndId(String name, int id);

	
	

}
