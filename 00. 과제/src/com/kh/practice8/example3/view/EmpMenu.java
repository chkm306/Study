package com.kh.practice8.example3.view;

import java.util.Scanner;
import com.kh.practice8.example3.model.vo.Employee;

public class EmpMenu {

	private Scanner sc = new Scanner(System.in);

	public EmpMenu() { // 기본 생성자
	}

	public void mainMenu() {

		Employee emp = null;

		while (true) { // 메뉴 화면 출력 --> 반복 실행 처리
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 선택: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1: // inputEmployee() 실행 -> 반환 값으로 emp 초기화
				emp = inputEmployee();
				break;
			case 2: // modifyEmployee() 실행
				modifyEmployee(emp);
				break;
			case 3: // 가비지 컬렉터가 지워주게끔
				emp = null;
				break;
			case 4: // Employee의 information() 사용
				System.out.println(emp.information());
				break;
			case 9: // return 처리
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("메뉴를 선택해주세요.");
				break;
			}
		}
	}


	public Employee inputEmployee() {
		// 키보드를 통해 사원 정보를 입력받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 값 반환
		System.out.println("사원명 : ");
		String empName = sc.nextLine();

		System.out.println("부서명 : ");
		String dept = sc.nextLine();

		System.out.println("직급 : ");
		String job = sc.nextLine();

		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);

		System.out.println("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();

		System.out.println("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();

		System.out.println("전화번호 : ");
		String phone = sc.nextLine();

		System.out.println("주소 : ");
		String address = sc.nextLine();

		Employee Nemp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		return Nemp; // 주소값 반환
	}

	public void modifyEmployee(Employee emp) { // 자료형 Employee 매개변수명 emp
		/* 서브 메뉴 화면 출력 --> 반복 실행 처리
		==== 사원 정보 수정 메뉴 ====
		1. 이름 변경
		2. 급여 변경
		3. 부서 변경
		4. 직급 변경
		9. 이전 메뉴로
		 각 번호에 맞춰 변경할 값을 입력 받고 setter 메소드를 이용하여 수정*/

		while (true) { // 무한루프문
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine(); //입력값 받기

			switch (num) {
			case 1:
				System.out.println("변경할 이름 : ");
				String empName = sc.nextLine();
				emp.setEmpName(empName);
				break;
			case 2:
				System.out.println("변경할 급여 : ");
				int salary = sc.nextInt();
				emp.setSalary(salary);
				break;
				
			case 3:
				System.out.println("변경할 부서 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
				
			case 4:
				System.out.println("변경할 직급 : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
				
			case 9:
				System.out.println("다시 입력해주세요.");
				return;
			}
		}
	}
}
