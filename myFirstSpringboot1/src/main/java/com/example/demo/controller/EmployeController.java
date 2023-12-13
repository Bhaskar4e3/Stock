package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Employe;
import com.example.demo.service.EmployeService;
@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	public EmployeService getEmployeService() {
		return employeService;
	}

	public void setEmployeService(EmployeService employeService) {
		this.employeService = employeService;
	}
	@GetMapping("/s")
	public String insertEmploye(Model model) {
		Employe employe1=new Employe();
	employe1.setId(7);
	employe1.setName("max");
	employe1.setAddress("banglore");
	employe1.setDepartment("IT");
	employe1.setExp(3);
	Employe emp=employeService.save(employe1);
	String name=emp.getName();
	model.addAttribute("name",name);
	model.addAttribute("exp",emp.getExp());
	
return "home";

	}
	@GetMapping("/d")
	public String deleteEmploye() {
		Employe employe=new Employe();
//		employe.setId(9);
//		//System.out.println(employe.getId());
//		employe.setName("steve");
//		employe.setAddress("banglore");
//		employe.setDepartment("IT");
		int id=7;
		employe=employeService.findById(id);
		System.out.println(employe.getName());
		
		employeService.delete(employe);
return "successfully deleted"+employe.getName()+" and id "+employe.getId()+"from database";
		
	}
	@GetMapping("/all")
	public List<Employe> loadAll() {
		List<Employe> emp=employeService.findAll();
//		for(Employe empl:emp) {
//			empl.getName();
//		}
		return emp;
	}
	@GetMapping("/")
	public String byId() {
int Id=1;
Employe employe=employeService.findById(Id);
		return "name "+employe.getName()+"";
	}
	@GetMapping("/u")
	public String update() {
		int id=2;
		Employe employe=employeService.findById(id);
		employe.setName("ahane");
		employeService.update(employe);
		return "done";
		
	}
	@GetMapping("/login")
	public String login(@ModelAttribute("employe")Employe employe) {
	//	DetachedCriteria criteria=DetachedCriteria.forClass(Employe.class);
		//criteria.add(Restrictions.eq("username", criteria));
		String name="raina";
		Employe emp=employeService.findByString(name);
		return "emplye data "+emp.getName()+" "+emp.getDepartment()+" ";
		
	}
	@GetMapping("/getemp")
	public String get(@ModelAttribute("employe")Employe employe) {
	//	DetachedCriteria criteria=DetachedCriteria.forClass(Employe.class);
		//criteria.add(Restrictions.eq("username", criteria));
		String name="raina";
		Employe emp=employeService.findByString(name);
		return "emplye data "+emp.toString()+"" ;
		
	}
	@GetMapping("/getbyexp")
	public String findByExp() {
		int exp=3;
		
		List<Employe> emp=employeService.findByexp(exp);
		
		return "employe data by exp "+emp.toString()+" ";
		
	}

	

	
	

}//" success fully inserted "+employe.getName()+" and id is "+employe.getId()+" ";

//"successfully deleted"+employe1.getName()+" and id id"+employe1.getId()+"from database";
