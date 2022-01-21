package com.kh.practice13.hw5.controller;

import java.util.Scanner;

public class NumberOk {
	public NumberOk() {
	}

	public void numGame() {
		// 사용자에게 숫자를 입력 받고 입력 받은 숫자가 임의의 난수와 비교 했을 때 작은지 큰지 , 몇 번 만에 맞추는지 맞추면 계속 할지 끝낼지
		// 묻는 메소드
		Scanner sc = new Scanner(System.in);

		int nan = (int) (Math.random() * 100 + 1); // 임의의 난수
		int count = 0; // 몇 번 만에 맟추는지 세기

		while (true) {
			count++;
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();

			if (num < nan) {
				System.out.println(num + "보다 큽니다." + count + "번째 실패!!");

			} else if (num > nan) {
				System.out.println(num + "보다 작습니다." + count + "번째 실패!!");

			} else if (num == nan) {
				System.out.println(count + "번 만에 맞췄습니다!");
				while (true) {
					System.out.println("계속 하시겠습니까? (Y/N)");
					char con = sc.nextLine().toUpperCase().charAt(0);

					if (con == 'N') {
						System.out.println("게임을 종료합니다.");
						return;
					}else if (con != 'Y') {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}else {
						break;
					}
				}
			}
		}
	}

}
