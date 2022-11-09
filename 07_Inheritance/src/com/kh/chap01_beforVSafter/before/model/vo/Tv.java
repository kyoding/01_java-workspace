package com.kh.chap01_beforVSafter.before.model.vo;

public class Tv {
	
	private String brand; // 브랜드명
	private String pCode; // 상품코드
	private String pName; // 상품명
	private int price; // 상품가격
	private int inch; // 인치
	
	
	// 기본
	
	public Tv() {}
	
	// 전체
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}

	
	// get set
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getInch() {
		return inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	//인포
	
	public String information() {
	      return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price + ", inch : " + inch;
	   }
	
	
	
	
	

}
