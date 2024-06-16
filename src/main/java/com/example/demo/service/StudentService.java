package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service

public class StudentService {
	
	@Autowired
	StudentRepository repo;

	public List<StudentEntity> saveDataService(List<StudentEntity> entity) {
		
		return repo.saveAll(entity);
	}

	public StudentEntity getById(int id) {
		
		return repo.findById(id).get();
	}

	public StudentEntity updateId(int id, StudentEntity update) {
	
//		StudentEntity std=new StudentEntity();
		
		StudentEntity getData=repo.findById(id).get();
		
		getData.setName(update.getName());
		getData.setEmail(update.getEmail());
		getData.setMaths(update.getMaths());
		getData.setEnglish(update.getEnglish());
		getData.setSocial(update.getSocial());
		getData.setPercentage(update.getPercentage());
		
		return repo.save(getData);
	}

	public void deleteId(int id) {
		repo.deleteById(id);
		
	}

	public List<StudentEntity> getAllId() {
		
		return repo.findAll();
	}

	public List<StudentEntity> getName(String name) {
		
		return repo.findByName(name);
	}

	public List<StudentEntity> getNameAndIdAndEmail(String name, int id, String email) {
	
		return repo.findByNameAndIdAndEmail(name,id,email);
	}

	public List<StudentEntity> getNameOrIdOrEmail(String data) {
		int data1=0;
		try {
			 data1=Integer.parseInt(data);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return repo.findByNameOrIdOrEmail(data,data1,data);
	}

	public StudentEntity saveData(StudentEntity entity) {
		
		return repo.save(entity);
	}

	


	
	

}
