package com.kh.practice11.hw2.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//부모 클래스의 draw 메소드 호출을 통해 	x, y 좌표 값 출력 후 사각형 면적, 둘레 값을 출력하는 메소드
	@Override
	public void draw() {
		super.draw();
		
		double num1 = width * height;
		double num2 = 2 * (width + height);
		
		// 면적 : 너비 * 높이
		// 둘레 : 2 * (너비 + 높이)
		System.out.println("면적 : " + num1);
		System.out.println("둘레 : " + num2);
	}
}
