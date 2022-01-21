package com.kh.practice7;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		int[][] arr = new int[4][4];

		// 값 대입
		int num = 1; // 값이 증가할 변수
		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr.length; j++) { // 열
				arr[i][j] = num++; // 증가
			}
		}
		// 배열 출력문
		for (int i = 0; i < arr.length; i++) { // 행
			System.out.println();
			for (int j = 0; j < arr.length; j++) { // 열
				System.out.printf(arr[i][j] + "\t");
			}
		}
	}

	public void practice2() { // 위와 동일하지만 거꾸로

		int[][] arr = new int[4][4];

		// 값 대입
		int num = 16; // 값이 증감될 변수

		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr.length; j++) { // 열
				arr[i][j] = num--; // 값이 배열 길이까지 감소
			}
		}
		// 배열 출력문
		for (int i = 0; i < arr.length; i++) { // 행
			System.out.println();
			for (int j = 0; j < arr.length; j++) { // 열
				System.out.printf(arr[i][j] + "\t");
			}
		}
	}

	public void practice3() {

		String[][] arr = new String[3][3];

		// 인덱스로 차례로 접근
		arr[0][0] = "(0, 0)";
		arr[0][1] = "(0, 1)";
		arr[0][2] = "(0, 2)";

		arr[1][0] = "(1, 0)";
		arr[1][1] = "(1, 1)";
		arr[1][2] = "(1, 2)";

		arr[2][0] = "(2, 0)";
		arr[2][1] = "(2, 1)";
		arr[2][2] = "(2, 2)";

		for (int i = 0; i < arr.length; i++) { // 행
			System.out.println();
			for (int j = 0; j < arr.length; j++) { // 열
				System.out.print(arr[i][j]);
			}
		}

		// for문으로 해보기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {

		int[][] arr = new int[4][4];

		int len = 0;

		// 오른쪽 합계
		for (int i = 0; i < arr.length - 1; i++) {
			len = arr[i].length - 1; // 합계 칸 뺀 길이
			int sum = 0;
			for (int j = 0; j < len; j++) { // 합계 칸 뺀 길이
				arr[i][j] = (int) (Math.random() * 10 + 1);
				sum += arr[i][j];
			}
			arr[i][len] = sum;
		}
		// 왼쪽 합계
		for (int i = 0; i < arr.length - 1; i++) {
			len = arr[i].length - 1;
			int sum1 = 0;
			for (int j = 0; j < len; j++) {
				sum1 += arr[j][i];
			}
			arr[len][i] = sum1;
		}
		// 맨 마지막 총합
		int sum3 = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				sum3 += arr[i][j]; // 배열 간 총합 구하기
			}
		}
		arr[3][3] = sum3;

		// 출력
		for (int i = 0; i < arr.length; i++) { // 행
			System.out.println();
			for (int j = 0; j < arr.length; j++) { // 열
				System.out.printf(arr[i][j] + "\t");
			}
		}
	}

	public void practice5() { // 하다맘
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("행의 크기 : ");
			int num1 = sc.nextInt();

			System.out.println("열의 크기 : ");
			int num2 = sc.nextInt();

			int ab = 0;

			if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {
				int[][] arr = new int[num1][num2];

				for (int i = 0; i < num1; i++) { // i는 행의 갯수
					System.out.println();
					for (int j = 0; j < num2; j++) { // j는 열의 갯수
						arr[i][j] = (char) ((int) (Math.random() * 26 + 65));
						// char ch = sc.nextLine().toUpperCase().charAt(0); // 숫자를 대문자로 만들어주는 메소드
					}
				}
				for (int i = 0; i < arr.length; i++) { // 행
					System.out.println();
					for (int j = 0; j < arr.length; j++) { // 열
						System.out.print(arr[i][j]);
					}
				}
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
	}

	public void practice6() {

		String[][] arr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int num1 = sc.nextInt();

		char[][] arr = new char[num1][];

		// 입력받은 행의 크기 증가
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			int num2 = sc.nextInt();
			arr[i] = new char[num2];
		}

		// a부터 하나씩 늘려서 저장
		char ch = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}

		// 행 열 출력문
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void pratice8() {
		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int num = 0;

		// 1분단 자리배치
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = student[num++];
			}
		}
		// 2분단 자리배치
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr1[i][j] = student[num++];
			}
		}

		// 출력문
		System.out.println("==== 1분단 ====");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==== 2분단 ====");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() { // 8번 복사
		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int num = 0;

		// 1분단 자리배치
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = student[num++];
			}
		}
		// 2분단 자리배치
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = student[num++];
			}
		}

		// 출력문
		System.out.println("==== 1분단 ====");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==== 2분단 ====");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==========================");

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();

		int num0 = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j].equals(name)) {
					System.out.print("검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 ");
					if (j == 0) {
						System.out.print("왼쪽");
					} else {
						System.out.print("오른쪽");
					}
					System.out.println("에 있습니다.");
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j].equals(name)) {
					System.out.print("검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 ");
					if (j == 0) {
						System.out.print("왼쪽");
					} else {
						System.out.print("오른쪽");
					}
					System.out.println("에 있습니다.");
				}
			}
		}
	}

}
