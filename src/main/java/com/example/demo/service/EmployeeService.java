package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public List<Employee> saveDataService(List<Employee> employee) {
		
//		Employee emp=new Employee();
		System.out.println();
		employee.toString();
		return repo.saveAll(employee);
		
	}

	public void deleteId(int id) {
		
		 repo.deleteById(id);
	}

	
	
	
	public List<Employee> getByName(String name) {
		return repo.findByName(name);
	}

	public List<Employee> getByNameOrId(String data) {
   System.out.println(data.toString());
		
		int data1=0;
		try {
			data1=Integer.parseInt(data);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return repo.findByNameOrId(data,data1);
	}

	public Employee getById(int id) {

		return repo.findById(id).get();
	}

	public List<Employee> getByNameAndId(String name, int id) {
	
		return repo.findByNameAndId(name,id);
	}


//	public Employee getById(Integer id) {
//		
//		return repo.findById(id).get();
//	}


	public Employee updateMethod(int id , Employee data) {
		
		
//		Employee emp=new Employee();
	Employee emp=repo.findById(id).get();
	emp.setName(data.getName());
	emp.setEmail(data.getEmail());
	emp.setEnglish(data.getEnglish());
	emp.setMaths(data.getMaths());
	emp.setSocial(data.getSocial());
	emp.setPercentage(data.getPercentage());
	
	return repo.save(emp);
	
	
	
	
	
		
	}
	
	
	
	

}
