package com.kh.phoneBook.model.vo;


public class Person {
	
	private String pNumber;
	private String category;
	
	public Person() {}
	
	public Person(String pNumber, String category) {
		super();
		this.pNumber = pNumber;
		this.category = category;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Person [pNumber=" + pNumber + ", category=" + category + "]";
	}
	
	
	
	
}	
	
	
	
		

