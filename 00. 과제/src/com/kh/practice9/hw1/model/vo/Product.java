package com.kh.practice9.hw1.model.vo;

public class Product {
	private char alphabette;
	private String mySubstring;
	
	
	public void printLottoNumbers() {
	}
	
	public void outputChar(int num, char c) {
	}
	
	public char alphabette() {
		return alphabette;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		return null;
	}

	
	
	
	public Product(char alphabette, String mySubstring) {
		super();
		this.alphabette = alphabette;
		this.mySubstring = mySubstring;
	}

	
	
	
	public char getAlphabette() {
		return alphabette;
	}

	public void setAlphabette(char alphabette) {
		this.alphabette = alphabette;
	}

	public String getMySubstring() {
		return mySubstring;
	}

	public void setMySubstring(String mySubstring) {
		this.mySubstring = mySubstring;
	}

	
	
	
	
	public String information() {
		return "alphabette=" + alphabette + ", mySubstring=" + mySubstring;
	}
	
	
	
	
	
}
