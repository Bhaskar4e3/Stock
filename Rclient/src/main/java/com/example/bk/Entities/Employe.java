package com.example.bk.Entities;

public class Employe {
	
	private int id;
	private String name;
	private String address;
	private String department;
	private int exp;
	public Employe() {
		super();
	}
	public Employe(int id, String name, String address, String department, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
		this.exp = exp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department + ", exp="
				+ exp + "]";
	}
	

}
