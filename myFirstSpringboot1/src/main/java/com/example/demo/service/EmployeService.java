package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.Employe;
@Component
public interface EmployeService {
	
	public Employe save(Employe employe);
	public Employe update(Employe employe);
	public void delete(Employe employe);
	public Employe findById(int id);
	public List<Employe> findAll();
	public Employe findByString(String name);
	public List<Employe> findByexp(int exp);

}
