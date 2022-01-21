package com.uni.chap07_method.part01_methodTest.run;

import com.uni.chap06_constructor.model.vo.User;
import com.uni.chap07_method.part01_methodTest.controller.NonStaticMethod;
import com.uni.chap07_method.part01_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		// ---------------------- NonStaticMethod
		NonStaticMethod test = new NonStaticMethod();
		
		
		// 1. 매개변수 없고 반환값도 없는 메소드
		test.method1();
		
		// 2. 매개변수 없고 반환값은 있는 메소드
//		String str = test.method2();
//		System.out.println(str);
		test.method2();
		System.out.println(test.method2());
		
		// 3. 매개변수 있고 반환값은 없는 메소드
		test.method3(10, 20); // 반드시 전달되는 값은 매개변수의 타입과 순서와 갯수가 일치해야함

		
		// 4. 매개변수 있고 반환값도 있는 메소드
		int result = test.method4(3, 5);
		System.out.println(result);
		
		User u1 = new User("user01","pass01", "로운");
		System.out.println(u1.toString());
		
		test.method(u1);
		System.out.println(u1.toString());
		
		// ---------------------- StaticMethod
		// 객체 생성할 필요 없이 클래스명.메소드명([전달값]) 으로 호출 => static이라서!
		StaticMethod.method1(); 
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("전지현");
		System.out.println(StaticMethod.method4("로운")); // 4번째꺼

	}

}
