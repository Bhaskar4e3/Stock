package com.example.bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.bk.entities.Employe;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		String viewname="home";
RestTemplate restTemplate=new RestTemplate();
Employe emp=restTemplate.getForObject("http://localhost:7070/employeee/6",Employe.class);
		//model.addAttribute("emp",emp);
String name="elyssi";
  model.addAttribute("name", name);
		System.out.println(emp.toString());
		return viewname;
		
	}

}
