package com.kh.practice9.hw2.run;

import java.util.Scanner;

import com.kh.practice9.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample non = new NonStaticSample();

		int[] arr = non.intArrayAllocation(5); // 1번 메소드에 값 전달

		System.out.print("크기가 5인 배열의 랜덤값 : ");
		non.display(arr); // display 메소드(배열 출력 메소드)를 통해 배열 출력

		// 내림차순 출력
		System.out.print("내림차순 출력 : ");
		non.sortDescending(arr);

		// 오름차순 출력
		System.out.print("오름차순 출력 : ");
		non.sortAscending(arr);

		// 문자 갯수 출력
		System.out.println(non.countChar("apple", 'p')); // 출력문으로 (이유알아내기)

		// 두 수 사이 합계 출력
		System.out.println(non.totalValue(13, 7));
		
		// 해당 인덱스의 문자 출력
		non.pCharAt("programming", 3);
		
		non.pConcat("JAVA", "programming");
		
		
		/*- 크기가 5인 배열의 랜덤값 : 54 92 79 23 80
		- 내림차순 출력 : 92 80 79 54 23
		- 오름차순 출력 : 23 54 79 80 92
		- apple문자열에 p의 갯수 : 2
		- 13과 7사이 정수들의 합계 : 50
		- programming문자열의 3번 인덱스 문자 : g
		- JAVA와 programming을 합친 문자열 : JAVAprogramming*/
	}

}
