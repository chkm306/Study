package com.uni.chap08_mvc.controller;

import com.uni.chap08_mvc.model.vo.Product;

//controller : 사용자의 요청에 의해서 서비스 호출전 파라미터셋팅.
//			   (서비스 단을 생략해서 현재는 비즈니스 로직(데이터의 수정,가공처리)을 구현)

public class ProductController {

	private Product pro = null; // 아무것도 없는 상태 블러옴

	public void insertProduct(String name, String brand, int price) {
		// TODO Auto-generated method stub
		pro = new Product(name, price, brand); // 저 위에 객체를 받기위해서 insert니까? 매개변수있는 생성자로 만들수있죠?먼소리지
	}

	public Product selectProduct() {
		return pro;
	}

	public void updatePrice(int nPrice) {
		pro.setPrice(nPrice);
	}
}
