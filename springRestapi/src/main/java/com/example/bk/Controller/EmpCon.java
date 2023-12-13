package com.example.bk.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bk.entities.Employe;
import com.example.bk.repository.EmpRep;
@RestController
@RequestMapping("/employeee/")
public class EmpCon {
	@Autowired
	private EmpRep empRep;

	public EmpRep getEmpRep() {
		return empRep;
	}

	public void setEmpRep(EmpRep empRep) {
		this.empRep = empRep;
	}
	@GetMapping("/")
	public List<Employe> getAll() {
		List<Employe> empl=empRep.findAll();
		return empl;}
		
	
	@GetMapping("/{id}")
	public String getbyid(@PathVariable("id") int id) {
		Optional<Employe> empl=empRep.findById(id);
		return "all emp data "+empl.toString()+" ";
		
	}
	@PostMapping("/1")
	public Employe save(@RequestBody Employe emp) {
		Employe emp1=empRep.save(emp);
		return emp1;}
		
	
	@PutMapping("/{id}")
	public Employe update(@PathVariable("id") int id,@RequestBody Employe empp) {
		Employe emp=empRep.findByid(id);		
		//Employe empu=new Employe();
		emp.setAddress(empp.getAddress());
		emp.setDepartment(empp.getDepartment());
		emp.setExp(empp.getExp());
		
		Employe emp1=empRep.save(emp);
		return emp1;
		
	}
//	@PutMapping("/{name}")
//	public Employe updateByname(@PathVariable("name") String name,@RequestBody Employe emp) {
//		Employe empu=empRep.findByName(name);
//		empu.setId(emp.getId());
//		System.out.println(empu.toString());
//		Employe em=	empRep.save(empu);
//		
//		return empu;
//		
//	}
	
	@DeleteMapping("/{name}")
	public String delete(@PathVariable("name") String name) {
		Employe emp=empRep.findByName(name);
		System.out.println(emp.toString());
		empRep.delete(emp);
		
		return "delete done";
		
	}
	

}
