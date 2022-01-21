package com.kh.practice13.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str1) {
		// 공백을 토큰으로 처리 한 글자 반환 (StringTokenizer)
		String result = "";
		StringTokenizer stz = new StringTokenizer(str1, " ");

		while (stz.hasMoreTokens()) {
			result += stz.nextToken();
		}
		return result;
	}

	public String firstCap(String input) {
		// 매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환(toUpperCase)
		
		String one = input.substring(0, 1); // 문자열 뽑아내기
		String two = input.substring(1);

		one = one.toUpperCase(); // 대문자로 변환

		String result = one + two;
		return result;
	}

	public int findChar(String input, char one) {
		// 매개변수로 받은 문자열 중에서 매개변수로 들어온 문자가 몇 개 존재하는지 개수를 반환
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) // 문자열 비교
				sum++;
		}
		return sum;
	}

}
