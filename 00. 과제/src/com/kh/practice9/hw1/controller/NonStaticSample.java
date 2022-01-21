package com.kh.practice9.hw1.controller;

public class NonStaticSample {

	public void printLottoNumbers() { // 1. 매개변수없고 반환값도 없는 메소드
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1); // 1부터 45까지의 난수

			for (int j = 0; j < i; j++) { // 중복 제거
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) { // 오름차순 정렬
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.print("랜덤 값 : ");

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}

	public void outputChar(int num, char c) { // 매개변수 있고 반환값은 없는 메소드
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		System.out.print(c + "문자 " + num + "개 출력 : ");
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public char alphabette() { // 매개변수 없고 반환값은 있는 메소드
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		int n = 0 ;
		char c = ' ';
		do {
			n = (int)(Math.random() * 58 + 65);
			
			if(n >= 65 && n <= 90 || n >= 97 && n <= 122) {
				c = (char)n;
				break;
			}
		}while(n >= 91 && n <= 96);
		
		return c;
	}

	public String mySubstring(String str, int index1, int index2) { // 4. 매개변수 있고 반환값도 있는 메소드
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : ", str, index1, index2);
		char[] arr = new char[str.length()];

		for (int i = 0; i < index2; i++) { // 배열에 문자를 넣음
			arr[i] += str.charAt(i);
		}

		for (int i = index1-1; i < index2; i++) {
			System.out.print(arr[i] + " ");
		}
		
		return null;
	}
}
