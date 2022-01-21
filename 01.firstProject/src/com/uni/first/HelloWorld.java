package com.uni.first; //유사한 클래스들을 묶어주는 패키지
// 한줄 컨트롤 + /
/* 영역, 전체 주석 -> 범위를 잡아서 컨트롤 + 쉬프트 + / */
/**
 * 클래스 명:
 * @author admin
 * 최초 작성자:
 * Data :
 * 설명
 * 
 * 
 */

//ctrl + z 실행을 뒤로
//ctrl + y 실행을 앞으로
//ctrl + s 저장

public class HelloWorld { // 클래스
    //public : 메인 메소드는 외부에서 호출 할 수 있다.
	//static : 객체를 생성하지 않고도 실행시킬 수 있다. 실행을 시키기만해도 메모리에 올라간다.
	//void : 반환되는 값이 없다.
	//String[] args : 스트링 배열로 인자를 받겠다.
	public static void main(String[] args) { //실행 메소드
		System.out.println("Hi"); // sysout 하고 컨트롤 + 스페이스
		// 컨트롤 + S 저장하기

		
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		
		System.out.println("안녕하세요"); //자동 줄바꿈
		System.out.print("안녕하세요"); //줄바꿈이 없음
		System.out.print("반갑습니다\n"); //역슬래시 n은 줄바꿈
		System.out.print("안녕하세요");
		
	}

}
