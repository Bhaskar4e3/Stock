package com.example.stock;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STOCKS")
public class Stock {
    @Id
    @Column(name = "STOCK_ID")
	private int stockId;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "PRICE")
    private Double price;
    
	public Stock() {
		super();
	}
	public Stock(int stockId, String companyName, Double price) {
		super();
		this.stockId = stockId;
		this.companyName = companyName;
		this.price = price;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", companyName=" + companyName + ", price=" + price + "]";
	}
    
	
}



