package com.uni.run; //메소드 호출 후 실행하기 메소드 프린터 안의 메소드 자바객체를 만들어줘야함

import com.uni.first.A_MethodPrinter;


public class RunA {

	public static void main(String[] args) {
		/* 1) 실행할 메소드가 있는 클래스를 생성 (new)
		 * [표현법] 클래스 명 사용할 이름(참조변수) = new 클래스명();
		 */
		A_MethodPrinter a = new A_MethodPrinter();
		/*2) 생성 후 메소드 실행(호출)
		 * [표현법] 사용 할 이름, 실행할 메소드 명();
		 * 
		 * 
		 * */
		
		/*a.methodA(); // a.은 메소드 불러오기
		a.methodB();
		a.methodC();*/
		
		a.methodA();
		
		
	}

}
