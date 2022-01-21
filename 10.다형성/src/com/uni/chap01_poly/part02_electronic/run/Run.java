package com.uni.chap01_poly.part02_electronic.run;

import com.uni.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.uni.chap01_poly.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poly.part02_electronic.model.vo.Electronic;
import com.uni.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.uni.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {

		/*// 1. 다형성을 적용하지 않았을 때
		
		ElectronicController ec = new ElectronicController();
		
		ec.insert(new Desktop("삼성", "데스크탑", 1000000, "geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 2000000, 3));
		ec.insert(new Tablet("애플", "아이패드", 1000000, false));
		
		System.out.println(ec.selectNoteBook());
		
		NoteBook n = ec.selectNoteBook();
		System.out.println(n);
		
		System.out.println(ec.selectTablet());*/

		// 2. 다형성을 적용한 경우

		ElectronicController2 ec2 = new ElectronicController2();

		ec2.insert(new Desktop("삼성", "데스크탑", 1000000, "geforce 1070"));
		ec2.insert(new NoteBook("LG", "그램", 2000000, 3));
		ec2.insert(new Tablet("애플", "아이패드", 1000000, false));

		Electronic d = ec2.select(0);
		Electronic n = ec2.select(1);
		Electronic t = ec2.select(2);
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);

		Electronic[] el = ec2.selecAll();

		// 일반 for
		for (int i = 0; i < el.length; i++) {
			if (el[i] instanceof Desktop) {
				System.out.println(((Desktop) el[i]).getGraphic());
			} else if (el[i] instanceof NoteBook) {
				System.out.println(((NoteBook) el[i]).getUsbPort());
			} else {
				System.out.println(((Tablet) el[i]).isPenFlag());
			}

			// for each
			/*for (Parent num : arr) {
				if(num instanceof Child1){ // 해당 인덱스에 실제 Child1 타입을 참조하고 있으면 true 아니면 false
					((Child1)num).printChild1(); // 자식1 형변환
				}else {
					((Child2)num).printChild2(); // 자식2 형변환
				}
			}*/

			for (Electronic et : el) {
				if (et instanceof Desktop) {
					System.out.println(((Desktop) et).getGraphic());
				} else if (et instanceof NoteBook) {
					System.out.println(((NoteBook) et).getUsbPort());
				} else {
					System.out.println(((Tablet) et).isPenFlag());
				}
			}
			/* 다형성을 사용하는 이유 
			 * 1. 부모타입의 객체배열로 다양한 자식들을 받아 올수 있다. 
			 * --> 부모타입 하나로 다양한 자식을 다룰수 있다. 
			 * 
			 * 2. 매개변수에 다형성을 적용하는 경우 메소드갯수가 줄어든다. 
			 */

		}
	}
}
