package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "http://localhost:2222/greet2",  name = "HELLO-SERVICE")
public interface HelloClient {
    @RequestMapping("/hello/{name}")
	public String invokeHelloService(@PathVariable String name);
}
