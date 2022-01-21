package com.uni.chap02_abstractAndInterface.model.vo;

public class BasketBall extends Sports{
	// 상속 받는 순간 --> 부모 클래스에있는 추상 메소드를 강제 오버라이딩 하게끔 뜸 
	// 또는 추상클래스라고 명시 하게끔 뜬다 --> 미완성 상태이기 때문에

	@Override
	public void rule() {
		System.out.println("공을 던져서 링에 넣어야 한다.");
	} // 자식이 상속받고 어디서든 구현을 해줘야함

}
