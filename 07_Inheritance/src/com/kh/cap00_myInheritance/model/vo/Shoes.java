package com.kh.cap00_myInheritance.model.vo;

public class Shoes extends Clothes {
	
	// 필드
	
	private boolean reSell;
	
	// 생성자 - 기본
	
	public Shoes() {}
	
	// 생성자 - 전체
	
	public Shoes(String cName, int price, String meterial, String brand , String color, boolean reSell) {
		super(cName, price, meterial, brand, color);
		this.reSell = reSell;
	}

	// get set
	
	public boolean isReSell() {
		return reSell;
	}

	public void setReSell(boolean reSell) {
		this.reSell = reSell;
	}
	
	
	// 인포
	
	public String information() {
		return super.information() + ", 리셀가능 : " + reSell;
	}
	

}
