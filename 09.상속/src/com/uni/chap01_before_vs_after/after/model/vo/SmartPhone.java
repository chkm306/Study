package com.uni.chap01_before_vs_after.after.model.vo;

public class SmartPhone extends Product {
	
	private String mobileAgency; // 통신사
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		// TODO Auto-generated constructor stub
		
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() { // override 메소드로 투스트링 불러옴
		return super.toString() + "mobileAgency : " + mobileAgency;
	} // 뒤에 여기 정보 추가하면 됨.
	
	
	
	
	
	

}
