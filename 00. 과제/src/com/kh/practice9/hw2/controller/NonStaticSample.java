package com.kh.practice9.hw2.controller;

public class NonStaticSample {

	public NonStaticSample() {
		// TODO Auto-generated constructor stub
	}

	public int[] intArrayAllocation(int length) { // 1번 메소드
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴

		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		return arr;
	}

	public void display(int[] arr) {
		// 전달받은 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void swap(int[] arr, int idx1, int idx2) {
		// 전달받은 배열의 각각의 인덱스 값을 교환 = 정렬하겠다
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 내림차순
					swap(arr, i, j); // swap 메소드 이용해서 정렬
				}
			}
		}
		display(arr);
	}

	public void sortAscending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) { // 오름차순
					swap(arr, i, j); // swap 메소드 이용해서 정렬
				}
			}
		}
		display(arr);
	}

	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		int num = 0; // 문자 갯수 셀 변수

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				num++;
			}
		}
		System.out.printf("%s 문자열의 %s의 갯수 : ",str,c);
		return num;
	}

	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		
		int sum = 0;
		
		if (num1 < num2) { // 순서가 차이날 경우 출력이 안되는 오류때문에 if으로 구분
			for (int i = num1 + 1; i < num2; i++) {
				sum += i;
			}
		} else {
			for (int j = num2 + 1; j < num1; j++) {
				sum += j;
			}
		}
		System.out.printf("%d과 %d사이 정수들의 문자 : ",num1,num2);
		return sum;
	}

	
	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		char ch = str.charAt(index);
		System.out.printf("%s 문자열의 %d번 인덱스 문자 : %s",str,index,ch);
		return ch;
	}

	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		String str = str1+str2;
		
		System.out.printf("\n%s와 %s를 합친 문자열 : %s",str1,str2,str);
		return str;
	}
}
