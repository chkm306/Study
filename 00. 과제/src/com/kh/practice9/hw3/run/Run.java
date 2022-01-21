package com.kh.practice9.hw3.run;

import com.kh.practice9.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {

		// StaticSample 클래스 변수인 value를 “Java”로 초기화 후 출력
		StaticSample.setValue("java");
		System.out.println("value : " + StaticSample.getValue()); // 그냥 게터메소드 부르고있었음 클래스 꼭 명시하기

		// toUpper 메소드 실행을 통해 대문자로 변경 후 출력
		System.out.print("대문자로 : "); // 위에처럼 출력이 안댐 ㅠㅠ 이유알아내기
		StaticSample.toUpper();

		// valueLength 메소드 실행을 통해 길이 출력
		System.out.println("길이 : "+StaticSample.valueLength());

		// valueConcat 메소드 실행을 통해 “PROGRAMMING” 문자열 합친 후 출력
		System.out.print("PROGRAMMING 붙여서 : ");
		System.out.println(StaticSample.valueConcat("PROGRAMMING"));

		// setChar 메소드 실행을 통해 “J”를 “C”로 변경 후 출력
		System.out.print("J => C = ");
		StaticSample.setChar(0, 'C');
	}
}
