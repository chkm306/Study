package com.kh.practice11.hw1.run;

import java.util.Scanner;

import com.kh.practice11.hw1.model.vo.Employee;
import com.kh.practice11.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		/* 1.3 명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의 사용데이터를 참고하여 3 명의 학생 객체 생성 후 반복문을 통해 출력
		 * 
		2.최대 10 명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 반복문을 사용하여 키보드로 사원 정보를입력 받도록 구현
		2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된 사원들의 정보 출력*/

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화

		Student[] std = new Student[3]; // 객체 배열 할당
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"); // 객체 배열에 객체 담고 바로 선언
		std[1] = new Student("김말동", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		/*for(int i = 0; i < std.length; i++) {
			System.out.println(std[i].infomation());
			}*/

		// 위의 학생 정보 모두 출력
		for (Student s : std) {
			System.out.println(s.infomation());
		}

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함
		
		Employee emp[] = new Employee[10];
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			
			System.out.print("키를 입력하세요 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게를 입력하세요 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여를 입력하세요 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서를 입력하세요 : ");
			String dept = sc.nextLine();
			
			emp[num] = new Employee(name, age, height, weight, salary, dept);
			num++;
			
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().charAt(0);
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			// ‘n’일 경우 더 이상 그만 입력 받도록..
			if(ch == 'n') {
				break;
			}
		}

		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i=0; i<num; i++) {
			System.out.println(emp[i].information());
		}
	}

}
