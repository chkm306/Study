package com.kh.practice13.hw6.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	public DateCalculator() {
	}

	public long leapDate() { // 가이드 침고
		// 1년 1 월 1 일부터 오늘까지의 총 날 수를 계산
		// 1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을 평년이면 365 일을 더함
		// 해당현재 연도가 윤년이면 2월을 29 일로 평년이면 28 일로더함 월의 날짜 수를 더함
		// (31일 : 1, 3, 5, 7, 8, 10, 12 월 30일 4, 6, 9, 11 월)

		Calendar today = Calendar.getInstance();
		long sumDays = 0L;

		for (int i = 1; i <= today.get(Calendar.YEAR); i++) { // 년수

			if (i == today.get(Calendar.YEAR)) { // 2021(올해)이 되면

				if (isLeapYear(i)) // 
					System.out.println("올해는 윤년입니다.");

				else
					System.out.println("올해는 평년입니다.");

				for (int j = 1; j <= (today.get(Calendar.MONTH) + 1); j++) { // Month

					if (j == (today.get(Calendar.MONTH) + 1)) { // 이번달이 되면
						for (int n = 1; n <= today.get(Calendar.DATE); n++) { // Date, 오늘이 되면
							sumDays += 1;
						}
					} else if (j == 2) {
						if (isLeapYear(i))
							sumDays += 29;
						else
							sumDays += 28;
					} else if (j == 4 || j == 6 || j == 9 || j == 11) {
						sumDays += 30;
					} else
						sumDays += 31;
				}
			} else {
				if (isLeapYear(i))
					sumDays += 366;
				else
					sumDays += 365;
			}
		}
		return sumDays;
	}

	public boolean isLeapYear(int year) {
		// 연도가 윤년이면 true, 평년이면 false 리턴
		// (윤년 연도가 4 의 배수이면서 100 의 배수가 아니거나 400 의 배수가 되는 해)

		GregorianCalendar gc = new GregorianCalendar();

		boolean result = gc.isLeapYear(gc.get(Calendar.YEAR));
		return result;
	}
}
