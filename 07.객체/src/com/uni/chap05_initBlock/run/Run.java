package com.uni.chap05_initBlock.run;

import com.uni.chap05_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		System.out.println(p.toString()); // 상위 오브젝트가 가진 메소드
		System.out.println(p); // 재정의한 걸 불러옴
		
		Product p1 = new Product();
		System.out.println(p1.toString());
	}

}
