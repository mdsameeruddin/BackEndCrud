package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("path")
	public List<Employee> saveData(@RequestBody List<Employee> entity) {
		
		
		return service.saveDataService(entity);
	}
	
	
	@GetMapping("/path/{data}")
	public List<Employee> getNameAndId(@PathVariable("data") String data) {
	
		return service.getByNameOrId(data);
	
		
	}
	
	@GetMapping("/pa/{name}/{id}")
	public List<Employee> getNameAndId(@PathVariable("name") String name ,@PathVariable("id") int id) {
	
		return service.getByNameAndId(name,id);
	
		
	}
	
	@DeleteMapping("/s1/{id}")
	public void deleteById(@PathVariable("id") int id) {
	 service.deleteId(id);
	}
	
//	
	@GetMapping("/pat/{id}")
	public Employee getId(@PathVariable("id") int id) {
	
		return service.getById(id);
	
		
	}
	
	@PutMapping("update/{id}")
	public Employee putMethodName(@PathVariable("id") int id, @RequestBody Employee entity) {
		
		
		return service.updateMethod(id,entity);
	}
}
