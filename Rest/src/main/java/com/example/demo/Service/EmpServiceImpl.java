package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employe;
import com.example.demo.repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Employe> getAll() {
		return empRepository.findAll();
	}

	@Override
	public Employe getByid(int id) {
		
		Employe emp=empRepository.getByid(id);
		return emp;
	}

	@Override
	public Employe getByString(String name) {
		return empRepository.getByname(name);
	}

	@Override
	public void update(Employe employe) {
		empRepository.save(employe);

	}

	@Override
	public Employe save(Employe employe) {
		
		return empRepository.save(employe);
	}

	@Override
	public void deleteByid(int id) {
		empRepository.deleteById(id);;

	}

}
