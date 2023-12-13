package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employe;
import com.example.restapi.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empService;
	
	
	public EmpService getEmpService() {
		return empService;
	}


	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}


	@GetMapping("/employeee/")
	public List<Employe> getAll() {
		
		List<Employe> emp=empService.getAll();
		
		return emp;
		
		
	}
	

}
