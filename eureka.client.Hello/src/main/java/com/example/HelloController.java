package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet2")
public class HelloController {
	@Autowired
	private DemoConfigProps demoConfigProps;
	@RequestMapping(value="/hello/{name}")
	public String sayHello(@PathVariable String name) {
		//String helloMsg="hello "+name+" ,where are you??";
		return demoConfigProps.getProps().get(AppConstants.greet_msg)+""
				+ " "+demoConfigProps.getProps().get(AppConstants.hi_msg);
	}
	

}
