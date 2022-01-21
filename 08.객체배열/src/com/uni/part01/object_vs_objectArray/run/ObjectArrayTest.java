package com.uni.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 기본 자료형 배열
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;

		System.out.println(arr); // 주소값이 출력됨
		System.out.println(arr[0]); // 실제값 1이 출력됨

		// arr의 자료형 : int[] -> 레퍼런스 변수 == 주소값을 가지는 변수
		// arr[index] 의 자료형 : int -> 일반 변수 == 실제 값을 가지고 있는 변수

		// 2. 객체들을 여러개 담을 때 객체 배열을 사용
		Book[] books = new Book[3];

		// books 의 자료형 : Book[] --> 레퍼런스 변수 == 주소값을 가지는 변수 // String인줄
		// books[index] 의 자료형 : Book --> 레퍼런스 변수 == 주소값을 가지는 변수 // 위랑 차이가 많음

		// books[index] = 객체 생성;
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();

		System.out.println(books); // 주소값이 나옴
		System.out.println(books[0]);

		// 실제 값이 들어가있는 곳은? books[index] 객체의 각 필드로 접근 !!
		System.out.println(books[0].getPrice()); // books[0].getPrice() 의 자료형 int --> 실제 값을 가지고있음

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {
			System.out.println(i + 1 + " 번째 도서 정보 입력");
			System.out.println("제목 : ");
			String title = sc.nextLine();

			System.out.println("저자 : ");
			String author = sc.nextLine();

			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 버퍼 빼주기

			System.out.println("출판사 : ");
			String publisher = sc.nextLine();

			books[i] = new Book(title, author, price, publisher);
		}

		// 전체 도서 정보 조회하기
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}

		// 도서 제목으로 검색
		System.out.println("검색할 도서 제목 :");
		String search = sc.nextLine();

		// 일반 for문 --> for loop문
		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle().equals(search))
				System.out.println(books[i].information());
		}
		// 향상된 for문 --> for each문
		for (int num : arr) {
			System.out.println(num);
		}
		for (Book b : books) {
			System.out.println(b.information());
		}

	}

}
