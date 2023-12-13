package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Employe;

public interface EmpService {
	public List<Employe> getAll();
	public Employe getByid(int id);
	public Employe getByString(String name);
	public void update(Employe employe);
	public Employe save(Employe employe);
	public void deleteByid(int id);
	

}
