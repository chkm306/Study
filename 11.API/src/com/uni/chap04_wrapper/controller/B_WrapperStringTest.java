package com.uni.chap04_wrapper.controller;

public class B_WrapperStringTest { // 1227 5:55 (왠지 시험에 나올삘)
	// 기본자료형 <--> String
	public void method1() {

		String str1 = "10";
		String str2 = "15.3";

		System.out.println(str1 + str2);// 문자열로 작업이된다. 문자열 -> 숫자로 바꾸는 작업이 필요

		// 1.String --> 기본 자료형 : 해당Wrapper클래스명.parseXXX() 사용

		int i = Integer.parseInt(str1); // 문자를 기본 자료형으로 바꿀때
		double d = Double.parseDouble(str2);

		System.out.println(i + d); // 25.3

		// 2. 기본자료형 --> String 으로 바꾸기 위해
		// 기본자료형 --> Wrapper-->String
		// 해당Wrapper 클래스.valueOf().toString()

		String strI1 = Integer.valueOf(i).toString(); // 기본에서 문자열로 바꿈
		String strD1 = Double.valueOf(d).toString();

		String strI = String.valueOf(i);
		String strD = String.valueOf(d);

		System.out.println(strI1); // 10
		System.out.println(strI); // 10
	}

}
