package com.kh.practice9.hw3.controller;

public class StaticSample {

	private static String value; // private static이라고 쓰니까 세터메소드 뜸

	public StaticSample() {
		// TODO Auto-generated constructor stub
	}

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용

		int len = value.length();
		char[] arr = new char[len];
		
		for(int i = 0; i < len; i++) {
			arr[i] = value.toUpperCase().charAt(i);
		}
		System.out.println(arr);
	}
	
	/*public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		int len = value.length();
		char[] arr = new char[len];
		
		for(int i = 0; i < len; i++) {
			arr[i] = value.charAt(i);
			if(arr[i] == index) {
				arr[i] = c;
			}
		}
		System.out.println(arr);
	}*/
	
	public static void setChar(int index, char c) {
		
		char[] arr = value.toCharArray();
		
		arr[index] = c;
		
		value = String.valueOf(arr);
		
		System.out.println(arr);
	}

	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		int num = 0; // 문자 갯수
		
		for(int i = 0; i <= value.length(); i++) {
			num = i++;
		}
		return num;
	}

	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		String str1 = value.toUpperCase();
		String str2 = str1+str;
		
		return str2;
	}
}
