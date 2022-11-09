package com.kh.cap00_myInheritance.model.vo;

public class Top extends Clothes {
	
	// 필드
	
	private String season;
	
	// 생성자 - 기본
	
	public Top() {}
	
	// 생성자 - 전체
	
	public Top(String cName, int price, String meterial, String brand , String color, String season ) {
		super(cName, price, meterial, color, brand);
		this.season = season;
	}

	
	// get set - season 만
	
	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	
	// 인포
	
	public String information() {
		return super.information() + ", 계절 : " + season;
	}
	
	
	
	
	
	

}
