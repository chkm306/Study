package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자 : ");
		String name = sc.nextLine();
		
		char ch = name.charAt(0);
		int num = ch;
		
		System.out.println("A Unicode : "+ num);
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		double num1 = sc.nextDouble();

		System.out.println("수학 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("영어 : ");
		double num3 = sc.nextDouble();
		
		
		System.out.println("총점 : "+ (int)(num1+num2+num3));
		System.out.println("평균 : "+ (int)(num1+num2+num3)/3);
		
		
	}

	public void method3() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2);  			// 2
		System.out.println((int)dNum);				// 2
//		
		System.out.println((double)iNum2*dNum);		//10.0
		System.out.println((double)iNum1);			//10.0
//		
		System.out.println((double)iNum1/iNum2);	//2.5
		System.out.println(dNum);					//2.5
	
		System.out.println((int)fNum);				//3
		System.out.println((byte)(iNum1/fNum));		//3
	
		System.out.println(iNum1/fNum);				//3.333333
		System.out.println((double)iNum1/fNum);		//3.333333333333335
		
		System.out.println(ch);						//'A'
		System.out.println((int)ch);				//65
		
		System.out.println((int)ch+iNum1);			//75
		System.out.println((char)((int)ch+iNum1));	//'K'


		
		
		
		
		
		
	}

		
		
}
