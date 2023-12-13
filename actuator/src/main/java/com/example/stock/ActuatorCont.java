package com.example.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorCont {
	@RequestMapping("/call")
	public String call() {
		return "actuator project";
	}

}
