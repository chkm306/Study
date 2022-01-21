package com.uni.chap03_set.part02_treeset.run;

import java.util.TreeSet;

import com.uni.chap03_set.part02_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("하하하");
		ts.add("나나나");
		ts.add("가가가");
		ts.add("다다다");
		ts.add("하하하");

		System.out.println(ts);

		TreeSet<Student> ts2 = new TreeSet<>();
		ts2.add(new Student("공유", 30, 100));
		ts2.add(new Student("이효리", 20, 90));
		ts2.add(new Student("유재석", 40, 60));
		ts2.add(new Student("공유", 10, 100));
		ts2.add(new Student("공유", 30, 100));

		// add일 때 애초에 어떤 정렬 기준을 가지고 담을지 제시하지 않게되면 ClassCastException 발생
		// TreeSet은 hashcode()나 equals()로 중복 판단을 하지 않고
		// compareTo()에 제시한 정렬필드가 같은 경우 동일 객체로 판단

		System.out.println(ts2);

		// 1. for each
		for (Student s : ts2) {
			System.out.println(s);
		}

		/*// 2. Iterator
		Iterator it = ts2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 3. ArrayList에 담아서
		ArrayList<Student> list = new ArrayList<>(ts2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
	}

}
