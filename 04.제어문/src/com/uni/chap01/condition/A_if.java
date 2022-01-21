package com.uni.chap01.condition;

import java.util.Scanner;

public class A_if {

	/*
	 * 단독 if 문 사용 if(조건식){ ....실행할 코드 ....; }
	 * 
	 * -> 조건식의 결과 값이 참(true) 이면 중괄호 안의 코드 실행 -> 조건식의 결과 값이 거짓(false) 이면 중괄호 안의 코드
	 * 무시하고 넘어감.
	 */

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
		}
		if (num < 0) {
			System.out.println("음수다");
		}
		if (num == 0) {
			System.out.println("0이다");
		}

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}

		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}

	}
	/*
	 * 단독 if 문 사용 if(조건식){ ....실행할 코드 ....; }
	 * 
	 * -> 조건식의 결과 값이 참(true) 이면 중괄호 안의 코드 실행 -> 조건식의 결과 값이 거짓(false) 이면 중괄호 안의 코드
	 * 무시하고 넘어감.
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름");
		String name = sc.nextLine();

		System.out.println("학년(숫자만)");
		int grade = sc.nextInt();

		System.out.println("반(숫자만)");
		int classNum = sc.nextInt();

		System.out.println("번호(숫자만)");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("성별(M/F)");
		char gender = sc.nextLine().charAt(0);

		System.out.println("성적(소수점 둘째 자리까지)");
		double score = sc.nextDouble();

		// 남학생 인지, 여학생인지, 둘다아닌경우 잘못입력하였습니다 (단순 if 문으로만 )

		String student = ""; // ??

		if (gender == 'M' || gender == 'm') {
			student = "남학생";
		}

		if (gender == 'F' || gender == 'f') {
			student = "여학생";
		}

		if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못 입력하였습니다.");
			return; // return 일 경우, 현재 메소드 뒤에 코드를 실행하지 않고 바로 이 메소드를 호출한 곳으로 빠져나간다.
		}

		System.out.println(grade + " 학년 " + classNum + "반 " + name + " " + student + "학생입니다.");

	}

	public void method4() {
		// 13살 이하는 어린이, 14부터 19살까지 청소년 , 20살부터 성인

		Scanner sc = new Scanner(System.in);

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();

		String result = "";

		if (age >= 20) {
			result = "성인";
		}
		if (age <= 13) {
			result = "어린이";
		}
		if (age < 20 && age > 13) {
			result = "청소년";
		}

		System.out.println(result);
	}

	public void method5() {
		// 입력된 값이 본인 이름이 맞는지 확인하는 메소드
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : "); 
		String name = sc.nextLine();
		
		if(name == "이효리") {
			System.out.println("본인입니다.");
		}
		if(name != "이효리") {
			System.out.println("본인이 아닙니다.");
		}
		
		
		//String 비교시 String 클래스에서 제공하는 equals() 메소드를 이용해서 비교한다.
		if(name.equals("이효리")) {
			System.out.println("본인입니다.");			
		}
		
		if(!name.equals("이효리")) {
			System.out.println("본인이 아닙니다.");			
		for (int i = 1;i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i+"출력");
		}
	}
	public class Method10 {
		public static void numbering(int limit)/*매개변수*/ {
			int i = 0;
			while (i < limit) {
				System.out.println(i);
				i++;
			}
		}
	}
	public static void main(String[] args) {
		numbering(5/*인자*/);
	}
}
