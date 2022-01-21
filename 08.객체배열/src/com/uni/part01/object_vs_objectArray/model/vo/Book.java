package com.uni.part01.object_vs_objectArray.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;
	private String publisher;

	// 매개변수가 있는 생성자가 있을때는 명시
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	public String information() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + ", 출판사 : " + publisher;
	}

	
}
