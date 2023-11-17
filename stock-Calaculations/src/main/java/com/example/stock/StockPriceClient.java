package com.example.stock;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-SERVICE")
public interface StockPriceClient {
	@GetMapping("/service/price/{companyName}")
	public ResponseEntity<Double> price(@PathVariable("companyName") String companyName);
	@GetMapping("/service/getall")
	public List<Stock> getStockList();
	@GetMapping("/service/port")
	public String port();

}
