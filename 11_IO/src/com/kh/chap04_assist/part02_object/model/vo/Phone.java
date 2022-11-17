package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // 직렬화
	
	// 객체 자체를 입출력 하고자 한다면 직렬화 과정 필수
	
	private String name;
	private int price;
	
	public Phone() {}
	
	// alt + shift + s => o
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	

}
