package com.uni.chap01_Abstraction.model.vo;


//vo : value object:  테이블 컴럼, 데이터등을 전달하고 관리하는 value object
//테이블 컬럼을 모아놓은 단위 ,데이터 전달및 표현관리
/*
 * 클래스의 구조 
 * 
 * public class 클래스명{
 * 
 * 		//필드부 
 * 
 * 		//생성자부
 * 
 * 		//메소드부
 * 
 * }
 *  데이 테이블 컬러 : dto
 *  
 *  
 * */

// 학생을 추상화해서 만든 클래스 (아직 미완성--> 클래스 = 구조체 + 메소드의 결합)
public class Student {

	// 필드 부
	// 접근 제한자 [스태틱같은 예약어(생략가능)] 자료형 변수명;
	//접근제한자 : 접근 할수있는 범위를 제한 할수있다. (public > protected > default > private)

	public String name; // 여기저기서 접근할 수 있음
	public int age;
	public double height;
	public int kor;
	public int math;
	
	// 생성자부
	// 메소드부
		
	

}
