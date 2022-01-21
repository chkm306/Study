package com.uni.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DimensionalArray {

	// 이차원배열 : 일차원 배열 여러개를 하나로 묶은 것

	public void method1() {
		/*
		 * 1. 이차원 배열 선언
		 *    자료형 배열명[][];
		 *    자료형[] 배열명[];
		 *    자료형[][] 배열명;
		 * */

		int arr1[][];
		int[] arr2[];
		int[][] arr;

		/*
		 * 2. 이차원 배열 할당
		 * 배열명 = new 자료형[행크기][열크기];
		 * 
		 * */

		arr = new int[3][5]; // 할당을 하게 되면 heap영역에 해당 크기만큼 공간이 할당

		// 행의 길이
		System.out.println("행의 길이 " + arr.length);

		// 열의 길이
		System.out.println("열의 길이 " + arr[0].length);
		System.out.println("열의 길이 " + arr[1].length);
		System.out.println("열의 길이 " + arr[2].length);

		// *****
		// *****
		// *****

		// 바깥쪽 for문 --> 행의 갯수만큼 반복
		// 안쪽 for문 --> 열의 갯수만큼 반복

		for (int i = 0; i < 3; i++) { // i는 행의 갯수
			for (int j = 0; j < 5; j++) { // j는 열의 갯수
				System.out.print("*");
			}
			System.out.println(); // 안쪽 for문이 수행되고나서 한줄이 바껴야해서
		}

		for (int i = 0; i < arr.length; i++) { // for문으로 배열 초기화
			for (int j = 0; j < arr[i].length/*열의 갯수5*/; j++) {
				System.out.print(arr[i][j] + " "); // 행과 열 나열
			}
			System.out.println();
		}
	}

	public void method2() {
		int[][] arr = new int[3][5];
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		// 1. 인덱스에 접근하여 값 기록
		/*arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;*/

		// 2. 중첩 for문을 이용해서 값 기록
		int value = 1;// 배열의 값을 증가시켜줄 변수

		for (int i = 0; i < arr.length; i++) {// 행 for문

			for (int j = 0; j < arr[i].length; j++) { // 열 for문 / arr[i].length:행의 길이가 바껴도 안바꿔도 됌
				arr[i][j] = value++; // 배열의 값 증가시키는 식

			}

			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);

			}
			System.out.println();
		}
	}

	public void method3() {
		// 이차원 배열의 할당과 동시에 초기화
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) { // 행 for문
			for (int j = 0; j < arr[i].length; j++) { // 열 for문

				System.out.print(arr[i][j] + "\t"); // 배열의 행과 열, tap 출력
			}
			System.out.println();
		}

	}

	public void method4() {
		// 가변배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은게 --> 2차원배열
		// 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.

		int[][] arr = new int[3][]; // 가변 배열할당 (행의 크기는 3)

		arr[0] = new int[2]; // 각 인덱스 마다 할당하기 ㅁㅁ
		arr[1] = new int[1]; // ㅁ
		arr[2] = new int[3]; // ㅁㅁㅁ

		for (int i = 0; i < arr.length; i++) { // for문으로 배열 초기화
			for (int j = 0; j < arr[i].length/*열의 갯수*/; j++) {
				System.out.print(arr[i][j] + " "); // 행과 열 나열
			}
			System.out.println();
		}

		// 1. 인덱스로 접근
		/*arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		
		arr[2][0] = 4;
		arr[2][1] = 5;
		arr[2][2] = 6;*/

		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++; // 배열 안의 값 증가
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void method5() {
		// 할당과 동시에 초기화
		int[][] arr = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		// 할당한 배열 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		} // 여기까지가 출력하는 식
	}

	public void method6() {
		// Scanner 이용해서 국어 점수와 영어점수를 3번 찍어서 각각 평균을 구하시오

		double[][] arr = new double[2][4]; // 평균은 출력

		// 국어 : ㅁㅁㅁㅁ(합)
		// 영어 : ㅁㅁㅁㅁ(합)

		Scanner sc = new Scanner(System.in); // ctrl shif O

		int arrILgth = 0; // 행의 길이

		for (int i = 0; i < arr.length; i++) {
			arrILgth = arr[i].length - 1; // 3 행의 길이-1 (합을 넣을 자리) ㅁㅁㅁ(ㅁ)
			double sum = 0; // 합계 구할 값
			for (int j = 0; j < arr[i].length - 1; j++) {// 마지막 합계 칸을 뺀 길이
				if (i == 0) {
					System.out.println("국어 점수 : ");
				} else {
					System.out.println("영어 점수 : ");
				}
				arr[i][j] = sc.nextDouble(); // 다 넣어줌
				sum += arr[i][j]; // 다 더해진 값
			}
			arr[i][arrILgth] = sum;
		}
		for (int i = 0; i < arr.length; i++) { // 행 for문
			for (int j = 0; j < arr[i].length; j++) { // 열 for문
				System.out.print(arr[i][j] + "\t"); // 배열의 행과 열, tap 출력
			}
			System.out.println();
		}
		System.out.println("국어 점수 평균 : " + arr[0][arrILgth] / arrILgth);
		System.out.println("영어 점수 평균 : " + arr[1][arrILgth] / arrILgth);

		/*		DecimalFormat f1 = new DecimalFormat("0.00"); // 소수점 둘째자리까지 떨어지게 어쩌구 17분에
		
				System.out.println("영어 점수 평균 : "+f1.format(arr[1][arrILgth]/arrILgth)); //어쩌구저쩌구
		*/
	}

	public void method7() {
		// 1부터 10사이의 랜덤값을 3행 3열에 값을 넣으려고 한다.
		// 중복제거해서 넣어보세요

		// 1. 일차원 배열을 이용해서 중복 제거
		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) { // 행
			arr[i] = (int) (Math.random() * 10 + 1);// 난수값 구하기

			for (int j = 0; j < i; j++) { // 열
				if (arr[i] == arr[j]) { // 중복 제거
					i--; // 돌아가라.
					break; // 스타삣.
				}
			}
		}

		// 2. 이배열을 3행 3열로 담기
		int[][] newArr = new int[3][3];

		int index = 0; // 값을 대입하기 위한 증가되는 값(위치선정)

		for (int i = 0; i < newArr.length; i++) { // 행
			for (int j = 0; j < newArr[i].length; j++) { // 열
				newArr[i][j] = arr[index++]; // 계속해서 증가하는 index를 통해 newArr 배열에 값 담기
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 빙고 (중복없이)
	public void bingo() {

		Scanner sc = new Scanner(System.in);

		// 1. 일차원 배열로 중복제거된 25개 값을 구해놓고, 이차원 배열에 대입
		int[] arr = new int[25];

		// 중복제거한 난수값 배열에 넣기
		for (int i = 0; i < arr.length; i++) { // 행
			arr[i] = (int) (Math.random() * 25 + 1); // 배열 안에 난수 1~100까지 구하기
			for (int j = 0; j < i; j++) { // 열
				if (arr[i] == arr[j]) { // 여기에 왜 i == j가 안될까?
					i--;
					break;
				}
			}
			// System.out.print(arr[i]+" ");
		}

		// 이차원 배열에 정리
		int[][] bingo = new int[5][5];

		int index = 0;

		for (int i = 0; i < bingo.length; i++) { // 행
			for (int j = 0; j < bingo[i].length; j++) { // 열
				bingo[i][j] = arr[index++]; // 계속해서 증가하는 index를 통해 bingo 배열에 값 담기
			}
		}
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				// System.out.print(bingo[i][j] + " ");
				System.out.printf("%4d", bingo[i][j]); // 탭으로 이쁘게 출력하기
			}
			System.out.println();

			// for(int i=0; i<bingo.length; i++) {
			// for(int j=0; j<bingo[i].length; j++) { // 이게 왜 j<i가 아닌지 j<bingo.length 이것도 왜
			// 아닌지 한번 해보기
			// bingo[i][j] = arr[index++]; //
			// }
		}
		//
		int count = 0; //
		System.out.println("=========== 빙고게임 시작 ============");
		while (true) {
			System.out.println("정수를 입력하세요 ");
			int num = sc.nextInt();
			sc.nextLine();

			count++;

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (bingo[i][j] == num) { // 같으면 지워주려고
						bingo[i][j] = 0; // 일치하면 0으로 지워주는거
					}
					System.out.printf("%4d", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println("게임을 끝내시겠습니까 ? (y / n) : ");
			char ch = sc.nextLine().toUpperCase()/*대문자로 바꿔주는 메소드*/.charAt(0);

			if (ch == 'Y') {
				break;
			}
		}
		System.out.println(count + "번 입력 하였습니다.");
	}
}
