package com.kh.practice11.hw2.model.vo;

public class Circle extends Point{

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	// 부모 클래스의 draw() 메소드 호출을 통해 x, y 좌표 값 출력 후 원의 면적, 둘레 값을 출력하는 메소드
	@Override
	public void draw() {
		super.draw();
		double num1 = Math.PI * radius * radius;
		double num2 = Math.PI * 2 * radius;
		
		// 면적 : PI * 반지름 * 반지름
		// 둘레 : PI * 반지름 * 2
		System.out.println("면적 : "+num1);
		System.out.println("둘레 : "+num2);
	}
	
	
	
	
}
