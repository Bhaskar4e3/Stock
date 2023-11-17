package com.example.stock;

public class CompanyNotFoundErr extends RuntimeException {
	public CompanyNotFoundErr(String s) {
		super(s);
	}

}
