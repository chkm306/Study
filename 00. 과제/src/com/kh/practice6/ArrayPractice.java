package com.kh.practice6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10]; // 길이가 10인 정수형 배열

		for (int i = 1; i <= arr.length; i++) { // i는 방크기, 길이가 10까지 증가
			System.out.print(i + " ");
		}
	}

	public void practice2() { // 1의 역순 만들기
		int[] arr = new int[10];
	
		for (int i = 0; i < arr.length; i++) { // 행, 행의 길이보다 작게
			arr[i] = arr.length - i; // 배열의 길이(10)에서 줄어듦
//			System.out.printf("%d ", arr[i]);
			System.out.print(arr[i]+" ");
		}
	}


	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 1부터 num(arr.length)까지 늘어남
			System.out.print(arr[i] + " "); // i값을 출력해야하기 때문에 여기에 출력??
		}
	}

	public void practice4() {

		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" }; // 선언 후 바로 초기화

		System.out.println(arr[1]); // 바로 출력

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("귤")) { // arr만 호출하면 안되고 arr[i]로 해야함 (왜?)
				System.out.println(arr[i]);
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		// 1. 문자열 받고 배열 생성하기
		// 문자열 받기
		System.out.println("문자열 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()]; // 문자열만큼 배열 크기 설정

		// 배열 생성
		for (int i = 0; i < str.length(); i++) { // 위치
			arr[i] = str.charAt(i); // 배열에 각각 문자를 넣음
		}

		// 2. 문자 찾고 위치 구하기
		// 검색할 문자
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : "); // 뒤에 위치 출력

		// 위치 구하기
		for (int i = 0; i < str.length(); i++) {
			if (ch == arr[i]) {
				System.out.print(i + " ");
			}
		}
		// 갯수 구하기
		int sum = 0; // 개수 구할 변수
		System.out.println();
		System.out.print(ch + "의 개수 : ");

		for (int i = 0; i < str.length(); i++) { // 문자열 추출하고 갯수 구하기
			if (ch == arr[i]) {
				sum += i;
			}
		}
		System.out.print(sum);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		// 선언과 동시에 초기화
		char[] arr = { '월', '화', '수', '목', '금', '토', '일' };

		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		// for(int i = 0; i<arr.length; i++) {} 인덱스 위치

		// if문으로 인덱스 안의 값과 일치하면 출력, 아니면 안내문구 출력
		if (num <= 6 && num >= 0) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num]; // 입력받은 만큼 배열의 길이 할당

		// 배열의 크기만큼 값 입력 안내문 출력 후 인덱스의 값 초기화
		for (int i = 0; i < num; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		// 전체 배열값 나열
		// System.out.println(Arrays.toString(arr));
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.println(arr[i] + " ");
			sum += arr[i]; // 배열 간 총합 구하기
		}
		System.out.println("총합 : " + sum);
	}

	public void practice8() { // 문제자체도 어려움
		Scanner sc = new Scanner(System.in);

		while (true) { // 다시 출력해야하는 경우가 생겼기 때문에 무한루프문
			System.out.println("정수 : ");
			int num = sc.nextInt();

			if (num % 2 == 1 && num > 3) { // 입구컷

				int[] arr = new int[num]; // 입력받은 값만큼 배열의 길이

				int count = 1; // 값을 증감시킬 변수 설정
				for (int i = 0; i < num; i++) {
					arr[i] = count; // 배열에 값을 넣음
					if (i < arr.length / 2) {
						count++; // 배열 중간까지 1 증가
					} else {
						count--; // 배열 끝까지 감소
					}
				}
				for (int i = 0; i < num; i++) {
					System.out.print(arr[i] + " ");
				}
				break; // 무한루프 정지시키기

			} else {// 3 이하 거나 홀수가 아닐경우 안내문 출력
				System.out.println("다시 입력하세요");
			}
		}
	}

	public void practice9() { // 가이드 참조

		String[] arr = { "양념", "후라이드", "파닭", "갈릭", "간장", "로제" }; // 선언 후 초기화

		Scanner sc = new Scanner(System.in);

		System.out.println("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();

		boolean flag = false; // 불리언 변수와 if문의 환상의 콜라보

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(chicken)) {
				flag = true;
				break;
			}
		}
		if (flag) { // 와우
			System.out.println(chicken + "치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
	}

	public void practice10() {

		int[] arr = new int[10]; // 10개의 값을 저장할 배열 선언

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 난수 발생, 배열에 집어넣기

			System.out.print(arr[i] + " ");
		}

	}

	public void practice11() {

		int[] arr = new int[10];

		// 10번 문제와 동일
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			System.out.print(arr[i] + " ");
		}
		System.out.println(); // 다음 출력을 위해

		// 오름차순 정렬을 통해 맨앞의 값과 맨 뒤의 값으로 최소값 최대값 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) { // 오름차순 정렬을 위한 식
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
	}

	public void practice12() {
		int[] arr = new int[10]; // 10개의 값을 저장할 배열 선언

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 난수 발생, 배열에 집어넣기
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록번호(-포함)를 입력하세요 : ");
		String str = sc.nextLine();

		int len = str.length(); // 자주쓸거라서 변수설정
		char[] arr = new char[len]; // 문자열 길이만큼 배열

		for (int i = 0; i < len; i++) {
			arr[i] = str.charAt(i); // 배열에 문자 하나하나 담기
			if (i > 7) { // arr[7]이후부터는 *로 초기화
				arr[i] = '*';
			}
		}
		for (int i = 0; i < arr.length; i++) { // 출력 for문
			System.out.print(arr[i]);
		}
	}

	public void practice14() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1); // 배열에 난수값 넣기

			for (int j = 0; i > j; j++) { // 중복제거 for문
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) { // j=0으로 하면 내림차순 i+1로하면 오름차순
				if (lotto[i] > lotto[j]) { // 오름차순 if문

					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
