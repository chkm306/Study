package com.study.practice04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice04 {
	Scanner sc = new Scanner(System.in);

	public void method1() {

		/*System.out.println("메뉴 번호를 입력하세요 : ");
		
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
		
		} catch (InputMismatchException e) {
			Scanner sc = new Scanner(System.in);
		}*/

		int num = 0; // 미리 선언 위에꺼 에러★★★★★★★★★★★★
		String str = "";

		while (true) {
			try {
				System.out.println("=====================");
				System.out.println("1. 입력");
				System.out.println("2. 수정");
				System.out.println("3. 조회");
				System.out.println("4. 삭제");
				System.out.println("9. 종료");
				System.out.println("메뉴 번호를 입력하세요 : ");
				num = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); // 로그용 출력값이 입력으로 가버려서 무한반복됨
				sc.nextLine(); // 버퍼 빼주는 걸로 오류 잡음
				continue;
			}

			switch (num) {
			case 1:
				System.out.print("입력");
				break; // return으로 완전히 빠져나가면 종료됨.
			case 2:
				System.out.print("수정");
				break;
			case 3:
				System.out.print("조회");
				break;
			case 4:
				System.out.print("삭제");
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.print("없는");
			}
			System.out.print(" 메뉴입니다.\n");
			break;
		}

		/*// 3. switch문 이용할 때 String 변수 이용하는 방법 (가이드에 있던거 내꺼랑 비슷한 방식)
		switch (num) {
		case 1:
			str = "입력";
			break;
		case 2:
			str = "수정";
			break;
		case 3:
			str = "조회";
			break;
		case 4:
			str = "삭제";
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(str + " 메뉴입니다.");*/
	}

	/*public void method2() {
	
		int num = 0; // 받은 값 저장하기
	
		while (true) {
			try {
				System.out.println("숫자를 한 개 입력하세요 : ");
				num = sc.nextInt();
	
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				sc.nextLine();
			}
			break;
		}
		String result = num < 0 ? "양수만 입력해주세요.":
						num > 0 && num % 2 == 0 ? "짝수다." : 
						num > 0 && num % 2 == 1 ? "홀수다." : 
						"1 이상의 숫자를 입력해주세요."; // 0일 경우나 문자열일 경우
		System.out.println(result);
		// 잘못 입력했든 제대로 입력했든 바로 끝남
	}*/

	public void method2() { // 최종 : 예외처리+if문 사용 // 나중에 더블형으로 해볼까..

		int num = 0;

		while (true) {
			try {
				System.out.println("숫자를 한 개 입력하세요 : ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue;
			}

			if (num > 0) {
				if (num % 2 == 0) {
					System.out.println("짝수다");
					break;
				} else if (num % 2 == 1) {
					System.out.println("홀수다");
					break;
				}
			} else if (num <= 0) {
				System.out.println("양수만 입력해주세요.");
			}
		}
	}

	public void method3() { // 더블형으로 받아봤음 // 배열로 해보기
		double kor = 0;
		double math = 0;
		double eng = 0;

		while (true) {
			try {
				System.out.print("국어 점수 : ");
				kor = sc.nextDouble();
				System.out.print("수학 점수 : ");
				math = sc.nextDouble();
				System.out.print("영어 점수 : ");
				eng = sc.nextDouble();

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue; // 이거 안써주면............뭐더라? 아 if 맨 마지막 else로 가짐
			}

			double sum = kor + math + eng;
			double ave = sum / 3;

			if (kor >= 40 && math >= 40 && eng >= 40) {
				if (ave > 60) {
					System.out.printf("국어 : %.1f\n수학 : %.1f\n영어 : %.1f\n합계 : %.1f\n평균 : %.1f\n", kor, math, eng, sum,
							ave);
					System.out.println("축하합니다. 합격입니다!");
					break;
				} else {
					System.out.println("불합격입니다.");
					break;
				}
			} else {
				System.out.println("불합격입니다.");
				break;
			}
		}
	}

	public void method4() {
		
		int month;
		
		while (true) {
			try {
				System.out.println("-------------------");
				System.out.println("1~12월 사이의 정수 입력 : ");
				month = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue;
			}
			switch (month) {
			case 3, 4, 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6, 7, 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9, 10, 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 1, 2, 12:
				System.out.println(month + "월은 겨울입니다.");
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
	}
}
