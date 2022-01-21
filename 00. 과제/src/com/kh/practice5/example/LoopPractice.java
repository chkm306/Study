package com.kh.practice5.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;// if문에 break;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = num; i > 0; i--) { // 첫 시작이 i이자 num이고 줄어들어서 1까지 줄어든다
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	
	/*public void practice3() {
		int num = 0;
		for(int i = 0; i < 10; i++) {
			num = 10 - i;
			System.out.println(num+" ");
		}
	}*/

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i > 0; i--) { // 첫 시작이 i이자 num이고 줄어들어서 1까지 줄어든다
					System.out.print(i + " ");
				}
				break; // for문은 반복하게 두고 if문 들어와서 빠져나와야 함
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice5() { // 결과값 이상함.가이드참고할것
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println("= " + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			for (int i = num2; num1 >= i; i++) {
				System.out.print(i + " ");
			}
			for (int i = num1; num2 >= i; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				for (int i = num2; num1 >= i; i++) {
					System.out.print(i + " ");
				}
				for (int i = num1; num2 >= i; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자만을 입력해주세요.");
			}
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		System.out.printf("===== %d단 =====\n", num);

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num > 1 && num < 10) {
			// for (int i = 1; i < 10; i++) {
			// System.out.printf("===== %d단 =====\n", i);
			// for (int j = num; j <= 9; j++) {
			// System.out.printf("%d * %d = %d\n", j, i, (j * i));
			// }
			for (int j = num; j <= 9; j++) { // 순서 바꿔봄 실행잘됨
				System.out.printf("===== %d단 =====\n", j);
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d\n", j, i, (j * i));
				}
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		for (;;) {
			Scanner sc = new Scanner(System.in);

			System.out.println("숫자 : ");
			int num = sc.nextInt();

			if (num > 1 && num < 10) {
				// for (int i = 1; i < 10; i++) {
				// System.out.printf("===== %d단 =====\n", i);
				// for (int j = num; j <= 9; j++) {
				// System.out.printf("%d * %d = %d\n", j, i, (j * i));
				// }
				for (int j = num; j <= 9; j++) { // 순서 바꿔봄 실행잘됨
					System.out.printf("===== %d단 =====\n", j);
					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", j, i, (j * i));
					}
				}
				break; // if안에 break; 걸어주기
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.println("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.println("공차 : "); // 공차: 숫자들 사이에서 일정한 숫자의 차가 존재하는 것
		int num2 = sc.nextInt();

		int len = 0; // 길이
		for (int i = num1; len <= 10; i = i+ num2) {
			System.out.print(i + " ");
			len++; // ?
		}
	}

	public void practice12() { // 안됨.가이드 참고할것
		Scanner sc = new Scanner(System.in);

		System.out.println("연산자 (+, -, *, /, %) : ");
		String op = sc.nextLine();

		System.out.println("정수1 : ");
		int num1 = sc.nextInt();

		System.out.println("정수2 : ");
		int num2 = sc.nextInt();

		int result = 0;

		for (;;) {
			if (!op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (op.equals("+")) {
				result = num1 + num2;
			} else if (op.equals("-")) {
				result = num1 - num2;
			} else if (op.equals("*")) {
				result = num1 / num2;
			} else if (op.equals("/")) {
				if (num2 < 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 % num2;
			} else if (op.equals("%")) {
				result = num1 / num2;
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		}

		// if(num1 > 0) { //뭐 넣지
		// } else if (op.equals("+")) {
		// result = num1 + num2;
		// } else if (op.equals("-")) {
		// result = num1 - num2;
		// } else if (op.equals("*")) {
		// result = num1 / num2;
		// } else if (op.equals("/")) {
		// if(num2 < 0) {
		// System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
		// continue;
		// }
		// result = num1 % num2;
		// } else if (op.equals("%")) {
		// result = num1 / num2;
		// }else if(op.equals("exit")) {
		// System.out.println("프로그램을 종료합니다.");
		// break;
		// }else {
		// System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		// }
		// System.out.printf("%d %c %d = %d",num1,op,num2,result);

	}

	public void practice15() { // 여기서부터 더 해야함★★★★★★★
		// 소수: 나누어 떨어지는 수가 1과 자기자신 밖에 없는 수

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num > 2) {
			System.out.println("잘못 입력하셨습니다.");
		}

		for (int i = 2; i < num; i++) { // 2~num-1까지 반복

			if (num % i == 0) { // 딱 떨어지는 순간이 나오면 소수가 아님

				break;
			}
		}
	}

	public void practice16() { // 소수 구하는법

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int j = sc.nextInt();

		for (int i = 2; i <= 100; i++) {

			for (j = 2; j <= i; j++) {
				if (i % j != 0) {
					System.out.println("소수가 아닙니다.");
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		System.out.println("소수입니다.");
	}

	public void practice17() {

	}

	public void practice18() {

		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
	}

	public void practice19() {

	}

	public void practice20() {

	}

	public void practice21() {

	}

	public void practice22() {

	}
}