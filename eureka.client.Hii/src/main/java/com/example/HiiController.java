package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet1")
public class HiiController {
	
	@Autowired
	private HelloClient helloClient;
	@Autowired
	private Environment env;
	@RequestMapping("/hii/{name}")
	public String sayHii(@PathVariable String name) {
		String hiiMsg= "hii "+name+" , how are you";
		//String helloMsg=helloClient.invokeHelloService(name);
		//String serverPort=env.getProperty("local.server.port");
	//String nameapp=	env.getProperty("local.spring.application.name");
		//System.out.println(serverPort);
		//hiiMsg =  hiiMsg.concat("  runnig on server port no: "+serverPort);
		
		return hiiMsg;
	}

}
