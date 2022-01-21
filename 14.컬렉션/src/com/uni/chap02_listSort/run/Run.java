package com.uni.chap02_listSort.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.uni.chap02_listSort.model.comparator.AscCountry;
import com.uni.chap02_listSort.model.comparator.AscTravelNum;
import com.uni.chap02_listSort.model.comparator.DescTravelNum;
import com.uni.chap02_listSort.model.vo.Travel;

public class Run {

	public static void main(String[] args) {
		// 1. Comparable(java.lang) : 클래스의 기본 정렬 기준을 설정
		// - vo 클래스에 지정하고 어떤 기준의 오름차순과 내림차순 중 한번에 하나만 지정가능
		// - Integer,Double,String 같은 기본 제공되는 클래스들은 이미 구현
		// - 반드시 compareTo 메소드를 오버라이딩 해야 함

		// 2. Comparator(java.util) : 원하는 정렬 기준대로 설정 (사용자 정의)
		// - 따로 Comparator를 구현하는 클래스들을 만들어 오름차순과 내림차순에 대해 각각
		// 클래스 설정해서 사용 가능 (기준만큼 클래스를 만들어야 됨, 각 클래스는 한 가지 기준)
		// - 반드시 compare 메소드를 오버라이딩 해야함

		ArrayList<Travel> a1 = new ArrayList();
		a1.add(new Travel(1,"아이슬란드","오로라"));
		a1.add(new Travel(3,"라오스","블루라군"));
		a1.add(new Travel(2,"보홀","스킨스"));
		a1.add(new Travel(5,"블라디보스톡","발리"));
		a1.add(new Travel(4,"크로아티아","성벽투어"));
		//a1.add("abc");
		
		// 1. Collection 클래스 활용
		//-Comparable 사용시
		//Collections.sort(a1);
		
		//-Comparable 사용시
		Collections.sort(a1, new AscTravelNum());
		Collections.sort(a1, new DescTravelNum());
		Collections.sort(a1, new AscCountry());
		
		// 2. list.sort 활용
		//-Comparable 사용시
		//a1.sort(null);
		//-Comparable 사용시
		a1.sort(new DescTravelNum());
		
		
		// 1. 한번에 출력하는 방법
		// System.out.println(a1);
		
		// 2. for문
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		// 3. for each문
		for(Travel c : a1) {
			System.out.println(c);
		}
		
		// 4. 반복자 Iterator
		Iterator<Travel> it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
