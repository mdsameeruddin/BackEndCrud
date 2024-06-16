package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	List<StudentEntity> findByName(String name);

	List<StudentEntity> findByNameAndIdAndEmail(String name, int id, String email);

	List<StudentEntity> findByNameOrIdOrEmail(String name, int id, String eamil);

}
