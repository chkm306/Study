package com.kh.practice13.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public void spaceToUpper() {

		// 영문을 입력 받는다.
		Scanner sc = new Scanner(System.in);

		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();

		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를 구성
		StringTokenizer st = new StringTokenizer(str, " "); // 기준 " "
		StringBuilder sb = new StringBuilder();

		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		while (st.hasMoreTokens()) { // 토큰이 있는지 확인
			String token = st.nextToken(); // 문자열 하나씩 빼온다

			for (int i = 0; i < token.length(); i++) {
				if (i == 0)
					sb.append(token.toUpperCase().charAt(i)); // 뒤에 문자열(대문자) 추가
				else
					sb.append(token.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
