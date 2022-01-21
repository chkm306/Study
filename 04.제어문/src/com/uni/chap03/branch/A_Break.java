package com.uni.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break : 가장 가까운 반복문을 빠져나가는 문구
	// 단 switch 문안의 break 는 switch 문을 빠져나가는 break

	public void method1() {

		Scanner sc = new Scanner(System.in);

		/*for(;;) { // for문 무한루프
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println("str : " + str);
		
		}*/

		/*while(true) { //while문 무한루프 --> 조건식을 적어줘야 한다.
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println("str : " + str);
		}*/

		while (true) {

			System.out.println("문자열을 입력해주세요 :");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break; // 반복문을 강제로 빠져나가게 하는 구문
			}
			System.out.println("str : " + str);
		}
		// 무한 반복문 안에서 break 가 없는 경우 다음 코드 오류 ->
		// unreachable code 절대 도달 할수 없는 코드, 즉 절대 실행될일 없는 코드이다.

		System.out.println("exit 를 입력해서 종료 되었습니다.");

	}

	public void method2() {
		// 매번 반복적으로 랜덤값 (1~10) 을 발생시킨후 출력
		// 단, 그 랜덤값이 홀수일 경우 출력 하지않고 반복문을 빠져나간후 " 프로그램을 종료 합니다 " 출력

		while (true) {
			int random = (int) (Math.random() * 10 + 1);
			if (random % 2 == 1) {
				break;
			}
			System.out.println("랜덤값 " + random);
		}
		System.out.println("프로그램을 종료합니다.");
	}

	public void method3() {
		// 사용자에게 반복적으로 정수 2개와 연산기호(문자)(+, -) 를 입력받고
		// 그에 해당하는 계산 처리를 하시오
		// 단, 제시된 연산기호를 입력하지않고 다른 연산기호를 입력 했을경우 빠져 나가도록
		// while, if문사용

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("정수 1 입력 : ");
			int num1 = sc.nextInt();

			System.out.println("정수 2 입력 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			System.out.println("연산기호(+/-) 입력 : ");
			char num3 = sc.nextLine().charAt(0);

			int result = 0;

			if (num3 == '+') {
				result = num1 + num2;
			} else if (num3 == '-') {

				result = num1 - num2;
			} else {
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			System.out.println("result : " + result);
		}
	}
}
