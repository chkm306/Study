package com.uni.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {

	// 중복 제거
	public void method1() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 정수값");
			arr[i] = sc.nextInt();

			for (int j = 0; j < i; j++) {
				System.out.println(i + "          " + j);

				if (arr[i] == arr[j]) { // 중복된 값이 있는 경우
					System.out.println("중복된 값이 존재합니다.");
					i--;
					System.out.println("i-- : " + i);
					break; // 중복 출력 후 가장 가까운 반복문으로 빠져나감
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public void method2() {

		int[] arr = new int[5];
		// 1~10사이의 난수를 발생시켜 중복 없이 출력

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public void method3() {
		// 배열 10칸, 난수 100, 중복제거, 오름차순 정렬/내림차순정렬

		int[] arr = new int[10]; // 배열 10칸

		for (int i = 0; i < arr.length; i++) { // 비교주체i
			arr[i] = (int) (Math.random() * 100 + 1); // 난수 100
			for (int j = 0; j < i; j++) { // 비교대상j
				if (arr[i] == arr[j]) { // 중복 제거
					i--;
					break;
					/*if (arr[i] < arr[j]) {
					
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					
						for (int m = 0; m < arr.length; m++) {
							System.out.println(arr[m] + " ");
						}
					} else if (arr[i] == arr[j]) {
						i--; // 중복 제거
						break;*/
				}
			}
		}
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) { // 비교주체i(값)가 비교대상j보다 클때?? 내림차순 정렬

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
