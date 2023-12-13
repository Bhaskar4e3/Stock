package com.example.demo.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmpServiceImpl;
import com.example.demo.entities.Employe;

@RestController
public class EmpController {
	@Autowired
	private EmpServiceImpl empServiceImpl;

	@GetMapping("/call")
	public String call() {
		return "hiii";
	}
	@GetMapping("/employeee/")
	public List<Employe> getall(){
		List<Employe> emp=empServiceImpl.getAll();
		return emp;
		
	}
	@GetMapping("/employeee/{id}")
	public Employe getByid(@PathVariable("id") int id) {
		Employe emp=empServiceImpl.getByid(id);
		return emp;
		
	}
	@GetMapping("/employeeebyname/1")
	public Employe getByString() {
		Employe emp=empServiceImpl.getByString("watson");
		return emp;
		
	}
	@PutMapping("/employeee/")
	public String update() {
		Employe emp=new Employe(6,"perry","telangana","business",5);
		empServiceImpl.update(emp);
		return "updated successfully";
		
	}
	@PutMapping("/employeee/{id}")
	public String update1(@PathVariable("id") int id,@RequestBody Employe emp) {
		//Employe emp=new Employe(9,"hari","telangana","IT",5);
		Employe emp1=empServiceImpl.getByid(id);
		emp1.setDepartment(emp.getDepartment());
		emp1.setExp(emp.getExp());
		Employe empu=empServiceImpl.save(emp1);
		return "updated emp data"+empu+" ";
		
	}

	@PostMapping("/employeee/")
	public String save(@RequestBody Employe emp) {
		//Employe emp=new Employe(9,"hari","telangana","IT",5);
		empServiceImpl.save(emp);
		return "save successfully";
		
	}

	@DeleteMapping("/employeee/{id}")
	public String delete(@PathVariable("id") int id) {
		//Employe emp=new Employe(13,"ramu","telangana","IT",5);
		empServiceImpl.deleteByid(id);
		return "deleted successfully";
		
	}

}
