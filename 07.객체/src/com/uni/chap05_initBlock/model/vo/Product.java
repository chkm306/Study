package com.uni.chap05_initBlock.model.vo;

public class Product {
	
	/*// 1. 아무 초기화 없이 Product 객체를 생성해서 출력하게 되면 JVM이 정한 기본값으로 객체 생성이 되어있음
	// 멤버 변수
	private String pName;
	private int price;
	
	// 클래스 변수
	private static String brand;*/
	
	// 2. 필드에 명시적 초기화 한 후 객체 생성해서 출력
	private String pName = "갤럭시";
	private int price = 10000000;
	private static String brand = "삼성";
	
	private static int pNo = 0;
	// 3. static 블럭 - 클래스 변수를 초기화시키는 블럭으로 프로그램 시작시 딱 한번만 초기화 (=클래스 초기화)
	static {
//		pName= "g"; // static 블럭에서는 인스턴스 변수를 초기화 못함
//		price = 1000;
		brand = "엘지"; // static에 올라와있어서
	}
	
	// 4. 인스턴스 블럭 - 인스턴스 변수를 초기화시키는 블럭으로, 인스턴스(객체)생성 시 마다 초기화됨, 생성자보다 먼저 실행된다.
	{
		
		pName = "아이폰";
		price = 20000000;
		
		brand = "애플"; // --> 인스턴스 블럭에서는 static 필드도 초기화 가능
		pNo++;
		
		
	}
	public Product() {
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

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Product.brand = brand;
	}

	
	@Override
	public String toString() {
		return "Product [pNo : "+pNo+" pName=" + pName + ", price=" + price + ", brand="+brand+"]";
	}
	
	
	

}
