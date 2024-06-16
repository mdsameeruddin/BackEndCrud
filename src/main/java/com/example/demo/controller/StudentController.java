package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public StudentEntity saveData(@RequestBody StudentEntity entity) {
		return service.saveData(entity);
	}
	
	@PostMapping("/list")
	public List<StudentEntity> saveListData(@RequestBody List<StudentEntity> entity) {
		return service.saveDataService(entity);
	}
	
	@GetMapping("/s2/{id}")
	
public StudentEntity getId(@PathVariable("id") int id) {
		
		return service.getById(id);
		
		
}
	
	@GetMapping("/s3/{name}")
	public List<StudentEntity> getByName(@PathVariable("name") String name){
		return service.getName(name);
		
	}
	
	@GetMapping("/s4/{name}/{id}/{email}")
	public List<StudentEntity> getByNameAndIdAndEmail(@PathVariable("name") String name , @PathVariable("id") int id, @PathVariable("email") String email) {
		return service.getNameAndIdAndEmail(name,id,email);
	}
	
	
	@GetMapping("/s5/{data}")
	public List<StudentEntity> getByNameOrIdOrEmail(@PathVariable("data") String data) {
		return service.getNameOrIdOrEmail(data);
	}
	
	
	
	@GetMapping("/s6")
	public List<StudentEntity> getAll() {
		return service.getAllId();
	}
	
	
	
	@PutMapping("s7/{id}")
	public StudentEntity updateById(@PathVariable("id") int id, @RequestBody StudentEntity update) {
		System.out.println("hi");
		System.out.println("hello");
		return service.updateId(id, update);
		
		
	}
	
	@DeleteMapping("s8/{id}")
	
	public void deleteById(@PathVariable("id") int id) {
		service.deleteId(id);
		
	}

}
