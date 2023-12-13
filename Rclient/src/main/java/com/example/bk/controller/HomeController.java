package com.example.bk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.bk.Entities.Employe;
import com.example.bk.Entities.User;

@Controller
public class HomeController {
//    @RequestMapping("/home")
//	public String call(Model model) {
//		String name="bhaskar";
//		model.addAttribute("name",name);
//		String viewname="home";
//		
//		return viewname;
//		
//	}
    @GetMapping("/get")
    public String getall(Model model) {
    	String viewname="file";
    	
 RestTemplate restTemplate=new RestTemplate()  ;
// User u=restTemplate.getForObject("http://localhost:7070/employeee/6",User.class);
 User[] u=restTemplate.getForObject("http://localhost:7070/employeee/",User[].class);
 model.addAttribute("user",u);
 for(User ul:u) {
 System.out.println(ul.toString());}
		return viewname;
    	
    }
    @GetMapping("/getone")
    public String getOne(Model model) {
    	String viewname="home";
    	
 RestTemplate restTemplate=new RestTemplate()  ;
 int id=6;
User u=restTemplate.getForObject("http://localhost:7070/employeee/{id}",User.class,id);
 //User[] u=restTemplate.getForObject("http://localhost:7070/employeee/",User[].class);
 ResponseEntity<User> r=(ResponseEntity<User>) restTemplate.getForEntity("http://localhost:7070/employeee/{id}",User.class,id);
 model.addAttribute("user",u);
 System.out.println(u.toString());
 System.out.println(r.getHeaders());
 System.out.println(r.getStatusCode());
 System.out.println(r.getBody());
		return viewname;
    	
    }
    @GetMapping("/post")
    public String save(Model model) {
    	String viewname="post";
    	 RestTemplate restTemplate=new RestTemplate();
    	 User u=new User();
    	u.setId(9);
    	 u.setName("boult");
    	 u.setAddress("nz");
    	 u.setDepartment("cricket");
    	 u.setExp(5);
    	User g=restTemplate.postForObject("http://localhost:7070/employeee/1",u,User.class); 
    
    	model.addAttribute("user",g);
		return viewname;
    	
    }
    @GetMapping("/put")
    public String update() {
    	String viewname="update";
  int id=10;
  RestTemplate restTemplate=new RestTemplate();
  User u=restTemplate.getForObject("http://localhost:7070/employeee/{id}",User.class,id);
  User up=new User();
  u.setAddress("malaysia");
  u.setDepartment("cricket");
  //int uid=u.getId();
  restTemplate.put("http://localhost:7070/employeee/",u);
  
		return viewname;
    	
    }
    @GetMapping("/del")
    public String delete() {
    	String viewname="delete";
    	RestTemplate restTemplate=new RestTemplate();
    	String name="tim";
    	restTemplate.delete("http://localhost:7070/employeee/{name}",name);
    	
		return viewname;
    	
    }
}
