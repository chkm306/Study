package com.uni.chap02_inherit2.controller;

import com.uni.chap02_inherit2.model.vo.Vehicle;

public class Controller {
	private Vehicle[] ve = new Vehicle[3];
	private int count = 0;

	public void insert(Vehicle any) {
		ve[count++] = any;
	}

	public Vehicle[] selecAll() {
		return ve;
	}

	public Vehicle select(int index) {
		return ve[index];
	}
}
