package com.kh.practice4.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		String result = "";

		if (num == 1) {
			result = "입력 메뉴입니다.";
		} else if (num == 2) {
			result = "수정 메뉴입니다.";
		} else if (num == 3) {
			result = "조회 메뉴입니다.";
		} else if (num == 4) {
			result = "삭제 메뉴입니다.";
		} else if (num == 9) {
			result = "프로그램이 종료됩니다.";
		}
		System.out.println(result);
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0 && num >= 0) {
			System.out.println("짝수다.");

		} else if (num % 1 == 0 && num >= 0) {
			System.out.println("홀수다.");

		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수 : ");
		int test1 = sc.nextInt();

		System.out.println("수학 점수 : ");
		int test2 = sc.nextInt();

		System.out.println("영어 점수 : ");
		int test3 = sc.nextInt();

		int sum = test1 + test2 + test3;
		int ave = sum / 3;

		if (test1 >= 40 && test2 >= 40 && test3 >= 40 && ave >= 60) {
			System.out.println("국어 : " + test1);
			System.out.println("수학 : " + test2);
			System.out.println("영어 : " + test3);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + ave);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		String season = "";

		switch (month) {
		case 1, 2, 12:
			season = "겨울";
			System.out.println(month + "월은 " + season + "입니다.");
			break;

		case 3, 4, 5:
			season = "봄";
			System.out.println(month + "월은 " + season + "입니다.");
			break;

		case 6, 7, 8:
			season = "여름";
			System.out.println(month + "월은 " + season + "입니다.");
			break;

		case 9, 10, 11:
			season = "가을";
			System.out.println(month + "월은 " + season + "입니다.");
			break;

		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디 : ");
		String id = sc.nextLine();

		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();

		if (!id.equals("asdfg")) { // 틀린 경우에 출력해야 하니 !를 씀 (반대로도 해보기)
			System.out.println("아이디가 틀렸습니다.");
		} else if (!pw.equals("asdf")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("로그인 성공!");
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급 (관리자/회원/비회원) : ");
		String grade = sc.nextLine();

		if (grade.equals("관리자")) { // grade == "관리자"는 안됨.
			System.out.println("회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.println("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double BMI = kg / (m * m);

		System.out.println("BMI 지수 : " + BMI);

		if (BMI < 18.5) { // 18.5 미만
			System.out.println("저체중");
		} else if (BMI >= 18.5 && BMI > 23) { // 18.5 이상 23 미만
			System.out.println("정상체중");
		} else if (BMI >= 23 && BMI > 25) { // 23 이상 25 미만
			System.out.println("과체중");
		} else if (BMI >= 25 && BMI > 30) { // 25 이상 30 미만
			System.out.println("비만");
		} else if (BMI >= 30) { // 30 이상
			System.out.println("고도 비만");
		}
	}

	public void practice8() { // ★★★★★★★★★★★★★★★
		Scanner sc = new Scanner(System.in);

		System.out.println("피연산자 1 : ");
		int num1 = sc.nextInt();

		System.out.println("피연산자 2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("연산자 입력(+,-,*,/,%) : ");
		// int op = sc.nextInt(); 입력 안됨
		// String op = sc.nextLine(); result에서 오류
		char op = sc.nextLine().charAt(0);
		int result = 0;

		if (num1 < 0 && num2 < 0) { // 양수가 아닌 값
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else if (op == '%') {
			result = num1 % num2;
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		System.out.printf("%d %c %d = %d",num1,op,num2,result);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("중간 고사 점수 : ");
		int test1 = sc.nextInt();

		System.out.println("기말 고사 점수 : ");
		int test2 = sc.nextInt();

		System.out.println("과제 점수 : ");
		int test3 = sc.nextInt();

		System.out.println("출석 횟수 : ");
		int test4 = sc.nextInt();

		// 중간 20퍼 기말 30퍼 과제 30퍼 출석 20퍼
		// 총점이 70점 이상이면서 전체 강의의 70% 이상 출석을 했을 경우 Pass 아니면 Fail

		double result1 = test1 * 0.2; // int형으로 해놓고 소수 곱하면 오류남
		double result2 = test2 * 0.3;
		double result3 = test3 * 0.3;
		double result4 = (test4 * 5) * 0.2; // 출석 일수를 퍼센트로 구하기 ★★★★★★식 다시

		double ave = result1 + result2 + result3 + result4;

		System.out.println("======= 결과 =======");
		String print1 = "출석 횟수 부족";
		String print2 = "점수 미달";

		if (ave >= 70 && result4 >= 14) {
			System.out.println("중간 고사 점수(20) : " + result1);
			System.out.println("기말 고사 점수(30) : " + result2);
			System.out.println("과제 점수(30) : " + result3);
			System.out.println("출석 점수(20) : " + result4);
			System.out.println("총점 : " + ave); // 괄호 안치면 문자열 우측에 나열됨.

			System.out.println("PASS");
		} else if (result4 < 14 && ave < 70) {
//			 System.out.printf("FAIL [%d] (%d/20)", print1, ave); // 에러남 ㅜㅠ
//			 System.out.printf("FAIL [%d] (총점 %d)", print2, ave); // 에러남 ㅜㅠ

			System.out.println("FAIL [출석 횟수 부족] (" + test4 + "/20)");
			System.out.println("FAIL [점수 미달] (총점 " + ave + ")");
		} else if (result4 < 14) {
//			 System.out.printf("FAIL [%d] (%d/20)", print1, ave);
			System.out.println("FAIL [출석 횟수 부족] (" + test4 + "/20)");
		} else if (ave < 70) {
//			 System.out.printf("FAIL [%d] (총점 %d)", print2, ave);
			System.out.println("FAIL [점수 미달] (총점 " + ave + ")");
		} else {
		}
	}

	public void practice10() {// 클래스 내의 메소드 호출하기
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.printf("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. Pass/fail\n");

		System.out.println("선택 : ");
		int num = sc.nextInt();

		if (num == 1) {
			practice1();
		} else if (num == 2) {
			practice2();
		} else if (num == 3) {
			practice3();
		} else if (num == 4) {
			practice4();
		} else if (num == 5) {
			practice5();
		} else if (num == 6) {
			practice6();
		} else if (num == 7) {
			practice7();
		} else if (num == 8) {
			practice8();
		} else if (num == 9) {
			practice9();
		}
	}
}
