package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Employe;
import com.example.demo.repository.EmployeeRepository;
@Component
@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
	private EmployeeRepository employeRepository;
    
	public EmployeeRepository getEmployeRepository() {
		return employeRepository;
	}

	public void setEmployeRepository(EmployeeRepository employeRepository) {
		this.employeRepository = employeRepository;
	}

	@Override
	public Employe save(Employe employe) {
		Employe emp=employeRepository.save(employe);
		return emp;
	}

	@Override
	public Employe update(Employe employe) {
		Employe emp=employeRepository.save(employe);
		return emp;
	}

	@Override
	public void delete(Employe employe) {
		employeRepository.delete(employe);

	}

	
	public Employe findById(int id) {
		Employe emp=employeRepository.findById(id).get();
		return emp;
	}

	@Override
	public List<Employe> findAll() {
		List<Employe> empl=employeRepository.findAll();
		return empl;
	}
	public Employe findByString(String name) {
	Employe emp=(Employe)employeRepository.findByString(name);
		return emp ;
		
	}

	@Override
	public List<Employe> findByexp(int exp) {
		
		return employeRepository.findByexp(exp);
	}

}
