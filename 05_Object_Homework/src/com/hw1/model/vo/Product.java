package com.hw1.model.vo;

public class Product {

	//필드선언 private
	
	private String productId; // 상품아이디
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price; // 가격
	private double tax; // 부가세비율
	
	// 생성자 - 기본
	public Product() {}
	
	
	// 생성자 - 전체
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	//getter setter
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price; 
	}
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// 인포메이션1
	
	public String information1() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}
	
	// 인포메이션2
	
	public String information2() {
		return "상품명 : " + productName + "\n" + "부가세 포함 가격 : " + (int)(price + (price * tax));
	}
	
	
}
