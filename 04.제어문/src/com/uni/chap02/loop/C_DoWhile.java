package com.uni.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{
	 * 		반복적으로 실행할 코드; 
	 * 		[증감식]
	 *  }while(조건식); 
	 *  
	 * 초기식  --> 무조건 한번은 실행 --> 증감식 
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
	 * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */

	public void method1() {
		int num = 1;
		do {
			System.out.println(num); // 한번은 찍힌다
		} while (num == 0);
	}

	public void method2() {
		// 1부터 5까지
		int i = 1;
		do {
			// System.out.println(i + " ");
			// i++;

			System.out.print(i++ + " ");
		} while (i <= 5);
	}

	public void method3() {

		int random = (int) (Math.random() * 10 + 1);
		System.out.println("랜덤값 " + random);

		int sum = 0;
		int i = 1;

		do {
			sum += i;
			i++;
		} while (i <= random);
		{
			System.out.println("1부터 " + random + "까지의 합 : " + sum);
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수(2~9) 입력 : ");
		int dan = sc.nextInt();

		if (dan > 1 && dan < 10) {
			int i = 1;
			do {

			} while (i < 10);
			{
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
				i++;
			}
		} else {
			System.out.println("반드시 2~9 사이의 양수를 입력해야합니다.");
		}
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.println("문자열 길이 : " + str.length());

		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;

		} while (i < str.length());
	}

	public void method7() { // 반대인경우 한번해보기!!!!!!!!
		// 계속 문자열을 입력 받고 그문자열을 출력 하게끔
		// 하지만 그문자열이 "exit" 가 아닐때 까지 반복

		Scanner sc = new Scanner(System.in);
		String str = "";

		do {
			System.out.println("문자열을 입력해주세요 :");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
		{
			System.out.println("exit 를 입력해서 종료 되었습니다.");
		}

	}

	public void method8() { // 반복문을 빠져나가는 분기문
		// 무한루프, break 이용
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("문자열을 입력해주세요 :");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
		} while (true);
		System.out.println("exit 를 입력해서 종료 되었습니다.");
	}
}
