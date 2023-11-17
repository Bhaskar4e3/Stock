package com.example.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class StockCont {
	@Autowired
	private Environment env;
	@Autowired
	private StockRepo stockRepo;
	@GetMapping("/port")
	public String port() {
		return env.getProperty("local.server.port");
	}
	@RequestMapping(value = "/call")
	
	public String say() {
		return "hii";
		
	}
	@GetMapping("/getall")
	public List<Stock> get() {
		return stockRepo.findAll();
	}

	@GetMapping(value = "/price/{companyName}")
	public ResponseEntity<Double> price(@PathVariable("companyName") String companyName) {
		
		Stock stk= stockRepo.findBycompanyName(companyName);
		String port=env.getProperty("local.server.port");
		return new ResponseEntity<>(stk.getPrice(),HttpStatus.OK);

		
	}
	@GetMapping(value = "/name/{price}")
	public String name(@PathVariable("price") Double price) {
		Stock s=stockRepo.findByprice(price);
		if(s==null) {
			throw new CompanyNotFound("company is not there");
		}
		return s.getCompanyName();
	}
	@PostMapping("/save")
	public Stock save(@RequestBody Stock s) {
	return	stockRepo.save(s);
		
	}
}
