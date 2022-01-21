package com.uni.chap02_inherit.model.vo;

public class Car extends Vehicle {

	private int tire;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		// TODO Auto-generated constructor stub
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "Car [tire=" + tire + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴려 움직인다.");
	}
	
	
	
	

}
