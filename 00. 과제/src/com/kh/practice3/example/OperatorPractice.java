package com.kh.practice3.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		String result = num == 0 ? "0이다" : num > 0 ? "양수다" : "음수다";
		System.out.println(result);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = num2 / num1;
		int result2 = num2 % num1;
		
		System.out.println("1인당 사탕 개수 : " +result1);
		System.out.println("남는 사탕 개수 : " +result2);
	
		
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine(); 
		
		System.out.println("학년(숫자만) : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("반(숫자만) : ");
		int num2 = sc.nextInt(); 
		
		System.out.println("번호(숫자만) : ");
		int num3 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0); 
		
		String result = gender == 'M' ? "남학생" : (gender == 'F'? "여학생" : "");
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double test = sc.nextDouble();
		
		System.out.println(num1+ "학년 "+ num2 +"반 "+ num3 + "번 " + name +" "+ result +"의 성적은 "+ test + " 이다.");
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("나이 : ");
		int age = sc.nextInt(); 
		
		String result = age > 19 ? "성인" : age <= 13 ? "어린이" : "청소년";
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("영어 : ");
		int num2 = sc.nextInt(); 
		
		System.out.println("수학 : ");
		int num3 = sc.nextInt(); 
		
		int result1 = num1 + num2 + num3;
		double result2 = (num1 + num2 + num3)/3;
		
		String result3 = num1 <= 40 ? "불합격" : num2 < 40 ? "불합격" : num3 < 40 ? "불합격" : result2 >= 60 ? "합격" : "불합격";
				
		
		System.out.println("합계 : " +result1);
		System.out.println("평균 : " +result2);
		System.out.println(result3);
		
		
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
				
		String result = num == '1'? "남자" : "여자";
		System.out.println(result);

		
	}
	
	public void practice9() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("정수2 : ");
		int num2 = sc.nextInt(); 
		
		System.out.println("입력 : ");
		int num3 = sc.nextInt(); 
		
		
		
		boolean result = num3 <= num1 || num3 > num2;
		System.out.println(result);
		
	}
	
	
	public void practice10() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("입력2 : ");
		int num2 = sc.nextInt(); 
		
		System.out.println("입력3 : ");
		int num3 = sc.nextInt(); 
		
		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);
		
	}
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A사원의 연봉 : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("B사원의 연봉 : ");
		int num2 = sc.nextInt(); 
		
		System.out.println("C사원의 연봉 : ");
		int num3 = sc.nextInt(); 
		
		double numRt1 = num1*1.4;
		double numRt2 = num2*1.0;
		double numRt3 = num3*1.15;
		
		String result1 = numRt1 > 3000 ? "3000 이상" : "3000 미만";
		String result2 = numRt2 > 3000 ? "3000 이상" : "3000 미만";
		String result3 = numRt3 > 3000 ? "3000 이상" : "3000 미만";
		
		
		System.out.println("A사원의 인센티브 포함 연봉 : " +numRt1+"이고, "+result1);
		System.out.println("B사원의 인센티브 포함 연봉 : " +numRt2+"이고, "+result2);
		System.out.println("C사원의 인센티브 포함 연봉 : " +numRt3+"이고, "+result3);

		
	}
	
}
