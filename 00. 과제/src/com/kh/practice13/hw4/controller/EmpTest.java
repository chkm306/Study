package com.kh.practice13.hw4.controller;

import java.util.Scanner;

import com.kh.practice13.hw4.model.vo.Employee;

public class EmpTest {

	public EmpTest() {
	}

	Employee[] emp = new Employee[6];

	public void setEmp() {
		// 크기가 6인 Employee[]을 만들고 위의 사용데이터에 나와 있는 순으로
		// Employee[]에 저장 및 한 사원에 대한이름, 나이, 급여, 세율을 입력 받고 저장
		emp[0] = new Employee("김문말", 24, 1500000, 1.245);
		emp[1] = new Employee("이장소", 40, 2500000, 1.4);
		emp[2] = new Employee("박금순", 22, 1780000, 1.3);
		emp[3] = new Employee("최봉호", 31, 1950000, 1.365);
		emp[4] = new Employee("홍달림", 34, 1650000, 1.212);

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.print("급여를 입력하세요 : ");
		int salary = sc.nextInt();

		System.out.print("세율을 입력하세요 : ");
		double tax = sc.nextDouble();

		emp[5] = new Employee(name, age, salary, tax);

	}

	public void printEmp() {
		for (Employee e : emp) { // for-each 문
			System.out.println(e);
		}
	}

	public void nameSortPrint() { // 오름차순 정렬

		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (0 < emp[i].getName().compareTo(emp[j].getName())) {
					Employee temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
	}

}
