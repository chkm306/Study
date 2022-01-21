package com.kh.practice13.hw1.view;

import java.util.Scanner;

import com.kh.practice13.hw1.controller.TokenController;

public class TokenMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() { // 아래의 메뉴 반복 실행
		/*1. 지정 문자열  tokenMenu() 실행
		2. 입력 문자열  inputMenu() 실행
		9. 프로그램 끝내기  “프로그램을 종료합니다.” 출력 후 종료
		메뉴 번호 :*/

		while (true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1: // tokenMenu() 실행
				tokenMenu();
				break;
			case 2: // inputMenu() 실행
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
	}

	public void tokenMenu() {
		// Token 처리 전 글자와 글자 개수를 출력하고
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력
		String str1 = "J a v a P r o g r a m";

		String str2 = tc.afterToken(str1);
		System.out.println("토큰 처리 전 글자 : " + str1);
		System.out.println("토큰 처리 전 개수 : " + str1.length());
		System.out.println();

		System.out.println("토큰 처리 후 글자 : " + str2);
		System.out.println("토큰 처리 후 개수 : " + str2.length());
		System.out.println("모든 대문자로 변환 : " + str2.toUpperCase());
	}

	public void inputMenu() {

		// 입력 받은 문자열을 TestController의 firstCap()의 인자로 보내 반환 값 출력
		System.out.println("문자열을 입력하세요 : ");
		String input = sc.nextLine();

		String result = tc.firstCap(input);
		System.out.println("첫 글자 대문자 : " + result);

		// 찾을 문자 입력 받아 TestController의 findChar()의 매개변수로 아까 입력 받은
		// 문자열과 문자 하나를 매개변수로 보내 반환 값 출력
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char num = sc.nextLine().charAt(0);

		int cNum = tc.findChar(input, num);
		System.out.println(num + "문자가 들어간 개수 : " + cNum);
	}

}
