package com.example.stock;


public class Stock {
    
  
	private int stockId;
    private String companyName;
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



