package com.example.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employe;
import com.example.restapi.repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepository empRepository;
	

	public EmpRepository getEmpRepository() {
		return empRepository;
	}

	public void setEmpRepository(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}

	@Override
	public List<Employe> getAll() {
		
		return empRepository.findAll();
	}

	@Override
	public Employe getbyid(int id) {
		return null;
	}

	@Override
	public Employe getByname(String name) {
		return null;
	}

	@Override
	public void Update(Employe employe) {

	}

	@Override
	public Employe deleteByid(int id) {
		return null;
	}

	@Override
	public void save(Employe employe) {

	}

}
