package com.kh.practice13.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDate {
	
	public SetDate() {
		// TODO Auto-generated constructor stub
	}

	public String todayPrint() {
		// 오늘의 년, 월, 일, 시, 분, 초를 각 변수에 담은 후 오늘을 String으로	리턴
		Date today = new Date();
		

		int year = today.getYear() + 1900; // 주의
		int month = today.getMonth() + 1; // 주의
		int day = today.getDate();
		int hour = today.getHours();
		int minute = today.getMinutes();
		int second = today.getSeconds();
		
		String result = "오늘은 "+year +"년 "+ month +"월 "+ day +"일이고 "+ hour +"시 "+ minute +"분 "+ second+"초를 지나가고 있습니다.";
		
		return result;
	}

	public String setDay() {
		// “2011년 3월 21일 월요일”을 세팅하여 출력
		
		Date today1 = new Date(111, 2, 21);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
		
		return sdf.format(today1);
	}
	
	

}
