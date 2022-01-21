package com.kh.practice9.hw1.run;

import com.kh.practice9.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample non1 = new NonStaticSample();
		
		non1.printLottoNumbers();
		
		non1.outputChar(5,'a');

		System.out.print("랜덤 영문자 출력 : ");
		System.out.println(non1.alphabette());
		
		non1.mySubstring("applefly",2,6);
		

	}
}
