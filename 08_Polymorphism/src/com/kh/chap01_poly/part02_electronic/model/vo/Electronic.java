package com.kh.chap01_poly.part02_electronic.model.vo;

public class Electronic {
	
	private String brand;
	private String nmae;
	private int price;
	
	public Electronic() {}

	public Electronic(String brand, String nmae, int price) {
		this.brand = brand;
		this.nmae = nmae;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", nmae=" + nmae + ", price=" + price;
	}
	
	
	

}
