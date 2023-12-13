package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employe;
import com.example.demo.service.EmpServiceImpl;

@RestController
public class EmpController {
	@Autowired
	private EmpServiceImpl empServiceImpl;
	
	
  

	@GetMapping("/employeee/")
	public List<Employe> getAll() {
		
		List<Employe> emp=empServiceImpl.getAll();
		
		return emp;
		
		
	}
	

}
