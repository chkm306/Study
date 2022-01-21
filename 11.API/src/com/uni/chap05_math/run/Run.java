package com.uni.chap05_math.run;

public class Run {

	public static void main(String[] args) {
		//상수필드
		System.out.println("파이 "+Math.PI ); // 3.141592653589793

		//절대값
		int num1 = -10;
		System.out.println(Math.abs(num1)); // 10
		
		//올림
		double num2 = 4.349;
		System.out.println(Math.ceil(num2)); // 5.0
		
		//반올림
		System.out.println(Math.round(num2)); // 4
		
		
		//버림
		System.out.println(Math.floor(num2)); // 4.0

		// 가장가까운정수값
		System.out.println(Math.rint(num2)); // 4.0

		// 제곱근(루트)
		System.out.println(Math.sqrt(num2)); // 2.0854256160314133

		// 제곱 --> pow(대상숫자 , 지수)
		System.out.println(Math.pow(2, 10)); // 1024.0

	}

}
