package com.camping.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.camping.controller.UserController;

public class Mainview {
	public Mainview() {
	}
	public static String ID; // 아이디는 변경 할 일이 거의 없음
	
	Scanner sc = new Scanner(System.in);
	UserController uc = new UserController();

	public void Mainmenu() {
		while (true) {
			try {
				System.out.println("=== 로그인 페이지 ===");
				System.out.println("1. 로그인");
				System.out.println("2. 회원 가입");
				System.out.print("메뉴 입력 : ");
				int open = sc.nextInt();
				sc.nextLine();

				switch (open) {
				case 1:
					uc.Login();
					
					break;
				case 2:
					uc.SignUp();
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue;
			}
		}
	}

	public void adminmenu() {
		System.out.println("0. 관리자 페이지");
		System.out.println("1. 마이 페이지 관리");
		System.out.println("2. 캠핑 예약 관리");
		System.out.println("3. 양도게시판 관리");
		System.out.println("4. 자유게시판 관리");
		System.out.println("5. 리뷰게시판 관리");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 9:
		default:
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
		}
	}

	/*private*/ void adminPage() {
		while (true) {
			System.out.println("===관리자 페이지===");
			System.out.println("1. 전체 글 조회");
			System.out.println("2. 공지사항 조회");
			System.out.println("3. 캠핑장 목록 조회");
			System.out.println("9. 이전 메뉴로");
			int adminMenu = sc.nextInt();
			sc.nextLine();

			switch (adminMenu) {
			case 1:
			case 2:
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void myPage() {

		while (true) {
			System.out.println("====마이 페이지 ====");
			System.out.println("1. 개인정보 조회");
			System.out.println("2. 개인정보 수정");
			System.out.println("3. 내 예약 조회");
			System.out.println("4. 포인트 충전");
			System.out.println("5. 회원 탈퇴");
			System.out.println("9. 이전메뉴로");
			System.out.println("메뉴 번호를 입력해 주세요 : ");
			int mypagemenu = sc.nextInt();
			sc.nextLine();

			switch (mypagemenu) {
			case 1:
			default:
			}
		}
	}

	public void transferBoard() {
		while (true) {

			System.out.println("===양도 게시판===");
			System.out.println("1. 양도 하기");
			System.out.println("2. 양도 받기");
			System.out.println("3. 내 양도 조회(삭제,수정)");
			System.out.println("9. 이전 메뉴로");
			int transferMenu = sc.nextInt();
			sc.nextLine();

			switch (transferMenu) {

			case 1:
			default:
			}
		}
	}

	public void freeBoard() {
		while (true) {
			System.out.println("===자유 게시판===");
			System.out.println("1. 검색하기");
			System.out.println("2. 정렬하기");
			System.out.println("3. 내 글 조회");
			System.out.println("4. 글 작성");
			System.out.println("9. 이전 메뉴로");
			int freeMenu = sc.nextInt();
			sc.nextLine();

			switch (freeMenu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void campSearch() {
		while (true) {
			System.out.println("===캠핑장 예약===");
			System.out.println("1. 캠핑장 검색");
			System.out.println("2. 캠핑장 정렬");
			System.out.println("9. 이전 메뉴로");

			System.out.println("메뉴 선택 : ");
			int search = sc.nextInt();
			sc.nextLine();

			switch (search) {
			case 1:
				break;
			case 2:
				break;
			case 9:
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void ReviewBoard() {
		while (true) {
			System.out.println("===리뷰 게시판===");
			System.out.println("1. 리뷰 글 쓰기");
			System.out.println("2. 리뷰 글 검색");
			System.out.println("3. 리뷰 글 정렬");
			System.out.println("4. 내 글 조회");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int Menu = sc.nextInt();
			sc.nextLine();

			switch (Menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
			default:
			}
		}
	}

}
