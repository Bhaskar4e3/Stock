package com.example.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderCont {
	@GetMapping("/product/id")
	public String ord() {
		return "order no is 122211";
	}

}
