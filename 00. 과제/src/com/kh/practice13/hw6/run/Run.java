package com.kh.practice13.hw6.run;

import com.kh.practice13.hw6.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		
		DateCalculator dc = new DateCalculator();

		System.out.println("총 날짜 수 : "+ dc.leapDate());

	}

}
