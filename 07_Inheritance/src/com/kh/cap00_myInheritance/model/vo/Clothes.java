package com.kh.cap00_myInheritance.model.vo;

public class Clothes {
	
	// 필드
	
	private String cName;
	private int price;
	private String meterial;
	private String brand;
	private String color;
	
	// 생성자 - 기본
	
	public Clothes() {}
	
	
	// 생성자 - 전체
	
	public Clothes(String cName, int price, String meterial, String brand, String color) {
		this.cName = cName;
		this.price = price;
		this.meterial = meterial;
		this.brand = brand;
		this.color = color;
	}

	
	// get set
	
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getMeterial() {
		return meterial;
	}
	
	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	// 인포
	


	public String information() {
		return "상품명 : " + cName + ", 가격 : " + price + ", 소재 : " + meterial + ", 브랜드 : " + brand + ", 색상 : " + color;
	}
	
	
	
	

}
