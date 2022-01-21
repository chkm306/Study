package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePratice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 "+height+"인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");


	}

	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력하세요 : ");
		int aInt = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int bInt = sc.nextInt();
		
		System.out.println("더하기 결과 : "+ (aInt+bInt));
		System.out.println("빼기 결과 : "+ (aInt-bInt));
		System.out.println("곱하기 결과 : "+ (aInt*bInt));
		System.out.println("나누기 몫 결과 : "+ (aInt/bInt));


		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double width = sc.nextDouble();
		
		System.out.println("세로 : ");
		double depth = sc.nextDouble();
		
		System.out.println("면적 : "+ (width*depth));
		System.out.println("둘레 : "+ (width+depth)*2);
		
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요 : ");
		String apple = sc.nextLine();

		char apple1 = apple.charAt(0);
		char apple2 = apple.charAt(1);
		char apple3 = apple.charAt(2);

		System.out.println("첫 번째 문자 : "+ apple1);
		System.out.println("두 번째 문자 : "+ apple2);
		System.out.println("세 번째 문자 : "+ apple3);
		
		
		

	}
	
	
	
}
