package com.example.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StocksGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksGatewayApplication.class, args);
	}

}
