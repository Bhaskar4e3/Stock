package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employe;

public interface EmpRepository extends JpaRepository<Employe, Integer> {

	public Employe getByid(int id);
	public Employe getByname(String name);
	
}
