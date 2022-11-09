package com.kh.chap01_beforVSafter.after.model.vo;

public class SmartPhone extends Product {

	private String mobileAgency;

	public SmartPhone() {
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	// 인포
	
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}

}
