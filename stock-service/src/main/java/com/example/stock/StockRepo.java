package com.example.stock;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Integer> {
	public Stock findBycompanyName(String companyName);
	public Stock findByprice(Double price);
}
