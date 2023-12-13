package com.example.restapi.service;


import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employe;
@Service
@Component
public interface EmpService {
	public List<Employe> getAll();
	public Employe getbyid(int id);
	public Employe getByname(String name);
	public void Update(Employe employe);
	public Employe deleteByid(int id);
	public void save(Employe employe);

}
