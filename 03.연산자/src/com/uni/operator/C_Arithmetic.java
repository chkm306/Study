package com.uni.operator;

public class C_Arithmetic {

	
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		
		System.out.println("num1 + num2 = "+ (num1 + num2));
		System.out.println("num1 - num2 = "+ (num1 - num2));
		System.out.println("num1 * num2 = "+ (num1 * num2));	// 곱하기
		System.out.println("num1 / num2 = "+ (num1 / num2));	// 나누기의 몫
		System.out.println("num1 % num2 = "+ (num1 % num2));	// 나누기의 나머지

		//값 % 2 == 0 --> 짝수
		//값 % 2 == 1 --> 홀수
		
		//값 % 5 == 0 --> 5의 배수
		
		
	}
	
	
	public void method2() {
		
		double a = 35;
		double b = 10;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		double sum = a + b; 
		System.out.println("a + b = "+ sum);
		
		
		double sub = a - b; 
		System.out.println("a - b = "+ sub);
		
		
		double mul = a * b; 
		System.out.println("a * b = "+ mul);
		
		
		double div = a / b; 
		System.out.println("a / b = "+ div);
		
		
		double mod = a % b;
		System.out.println("a % b = " + mod);

		
		int c = 27;
		System.out.println("c = "+ c);
		
		double result = a + a * b % c -a / b;
		
		/* 1. a35 * b10 =350.0
		 * 2. 350 % c = 26.0
		 * 3. a / b = 3.5
		 * 4. a + 26.0 - 3.5 = 57.5 
		 * 
		 * */
		
		System.out.println(result);
		
		
	}
	
	
	public void method3() {
		
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;			// 6 + 10 = 16		//a6, b10, c16
		int d = c / a;				// 16 / 6 = 2		//a6, b10, c16, d2
		int e = c % a;				// 16 % 6 = 4		//a6, b10, c16, d2, e4
		int f = e++;				// 4				//a6, b10, c16, d2, e4(5), f4
		int g = (--b) + (d--);		// 9 + 2 (1) = 11	//a6, b9, c16, d2(1), e5, f4, g11
		int h = 2;					// 2				//a6, b9, c16, d1, e5, f4, g11, h2
		
		
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		    //   6	+ 9 / ( 15 / 4) * (11  - 1) % (6   + 2)
			//   6  + 9 / 3         * 10        %  8
			//   6  + 3             * 10        %  8
			//   6  + 30 % 8
			//   6  + 6
			//   12
		
		// 6 (7) + 9 / (15 / 5) * (11 (10) - 1) % (5 + 2) =
		
		
		
		System.out.println("a : " + a);		// 7
		System.out.println("b : " + b);		// 9
		System.out.println("c : " + c);		// 15
		System.out.println("d : " + d);		// 1
		System.out.println("e : " + e);		// 6
		System.out.println("f : " + f);		// 4
		System.out.println("g : " + g);		// 10
		System.out.println("h : " + h);		// 2
		System.out.println("i : " + i);		// 12

		
		
	}
	
	
	
	
	
}
