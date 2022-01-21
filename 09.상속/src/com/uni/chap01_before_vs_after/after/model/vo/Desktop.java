package com.uni.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {

	private boolean allInOne; // 일체 여부

	public Desktop() {
		// TODO Auto-generated constructor stub
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price); // 생성자는 퍼블릭이라 접근
		// super() 생성자는 자식 생성자에서 부모생성자를 호출할 수 있다. 생성자로 접근은 반드시 첫 줄에 작성

		/*super.brand = brand; // 이렇게 불러오려면 부클에 접근제한자가 protected여야함
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;*/
		
		// super. 의 super 는 해당 객체의 부모주소를 담고있다.
		// 따라서 super. 으로 부모에 접근가능하다.

		// 단, 접근하고자 하는 필드가 private 일때는 접근 불가.
		// -> 부모필드를 자식까지만 접근 가능하게 하기위해 접속 제어자 protected 로 부모필드를 변경해서 사용!

		this.allInOne = allInOne; // 추가한거
	}// 슈퍼클래스 가져온거에 위에 있는 올인원까지

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return "Desktop [allInOne=" + allInOne + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void print() { // 부모꺼 지웠음
		System.out.println("나 데스크탑이야!!");
	}
	
	

}
