package com.example.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcCont {
@Autowired	
private	StockPriceClient stockPriceClient;

	@GetMapping("/stocks/{companyName}/{quantity}")
	public ResponseEntity<?> stocksPrice(@PathVariable String companyName
		,@PathVariable int quantity){
		Double price=0d;
		ResponseEntity<?> res=null;
		try {
	 res=	stockPriceClient.price(companyName);
		if(res.getStatusCode().value()==200) {
			price=quantity* (Double)res.getBody();
			String price1=Double.toString(price);
			return new ResponseEntity<>(price1,HttpStatus.OK);
		}
		}
		catch(Exception e) {
			res=new ResponseEntity<String>("company not a found",HttpStatus.BAD_REQUEST);

	}
		return res;
}
	@GetMapping(value = "/gettotalstocks")
	public List<Stock> getAllStocks(){
		return  stockPriceClient.getStockList();
	}
	@GetMapping("/portc")
public String port() {
	return stockPriceClient.port();
}
	@GetMapping("/call")
public String greet() {
	return "hello";
}
	
}