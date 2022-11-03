package com.kh.pr_classDiagram.model.vo;

public class Product {

	
	// 필드선언하기
	
	private String pName;
	private int price;
	private String brand;
	
	
	
	// 세터만들기
	public void setpName (String pName) {
		this.pName = pName;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public void setBrand (String brand) {
		this.brand = brand;
	}
	
	// 게터만들기
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	
}
