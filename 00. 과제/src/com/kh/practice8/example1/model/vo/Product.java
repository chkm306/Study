package com.kh.practice8.example1.model.vo;

public class Product {

	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;

	// 기본 생성자
	public Product() {
		// TODO Auto-generated constructor stub
	}

	// Alt + Shift + S >> 생성자필드
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}

	// Alt + Shift + S >> 게터세터

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// Alt + Shift + S >> 투스트링
	public String information() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}

}
