package com.uni.chap06_constructor.run;

import com.uni.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		
		// 1. 기본 생성자로 객체 생성 직후 해당 객체 정보 출력
		User u1 = new User();
		System.out.println(u1.toString());

		// 2. 매개변수 3개 짜리 생성자로 객체 생성
		User u2 = new User("user02", "pass02", "로운");
		System.out.println(u2.toString());

		// 3. 다른 매개변수 생성자를 사용해서 객체 생성 (매개 변수 5개짜리)
		User u3 = new User("user03", "pass03", "공명",20,'M');
		System.out.println(u3.toString()); // 스트링형이라 감싸줄게요?
		
		

	}

}
