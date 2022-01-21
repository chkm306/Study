package com.uni.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArray.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		// ObjectTest
		
		Book bk1 = null; // 왜 생성자로 안만들지?
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + " 번째 도서 정보 입력");
			
			System.out.println("제목 : ");
			String title = sc.nextLine();
			
			System.out.println("저자 : ");
			String author = sc.nextLine();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 버퍼 빼주기
			
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher); // 왜 여기서 담아주나
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else if(i == 2) {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		
		// 전체 도서 정보 조회하기
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// 도서 제목 검색
		
		System.out.println("검색할 도서 제목 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) { // bk2 만 불러오지 말고 bk1.getTitle()로 출력
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}else {
			System.out.println("검색되는 도서가 없습니다.");
		}
		
		
	}

}
