package com.kh.cap00_myInheritance.model.vo;

public class Bottom extends Clothes {
	
	// 필드
	
	private int bottomLength;
	
	
	// 생성자 - 기본
	
	public Bottom() {}
	
	// 생성자 - 전체
	
	public Bottom(String cName, int price, String meterial, String brand, String color, int bottomLength) {
		super(cName, price, meterial, color, brand);
		this.bottomLength = bottomLength;
	}

	// get set

	public int getBottomLength() {
		return bottomLength;
	}

	public void setBottomLength(int bottomLength) {
		this.bottomLength = bottomLength;
	}
	
	// 인포
	
	public String information() {
		return super.information() + ", 바지기장 : " + bottomLength + "부";
	}
	
	
	
}
