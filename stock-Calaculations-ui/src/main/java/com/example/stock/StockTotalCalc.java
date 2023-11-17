package com.example.stock;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockTotalCalc {
	
	public String getTotalStockPrice(String companyName,int quantity) {
		
	
	String REST_ENDPOINT="http://localhost:1111/calc/stocks/{companyName}/{quantity}";
  WebClient webclient=WebClient.create();
		     String response=webclient.get().
		    		                uri(REST_ENDPOINT, companyName, quantity)
		    		                .retrieve().bodyToMono(String.class)
		    		                .block();
			return response;
		     
		    		                
}
	public String getall(){
   String REST_ENDPOINT="http://localhost:2211/calc/gettotalstocks";
		WebClient webClient=WebClient.create();
		 String stocks=  webClient.get().uri(REST_ENDPOINT)
				 .retrieve().bodyToMono(String.class)
		          .block();
		 
		 System.out.println(stocks);
		return stocks;
		
	}
}