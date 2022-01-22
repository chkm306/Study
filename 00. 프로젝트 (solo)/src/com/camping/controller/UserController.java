package com.camping.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserController {
	Scanner sc = new Scanner(System.in); // static으로 선언을 안하니까 20행에서 빨간줄

	public void SignUp() {
		File file = new File("C:\\Jworkspace\\00. 프로젝트 (solo)\\src\\com\\camping\\MemberDB.txt");

		try {
			FileWriter filewriter = new FileWriter(file, true); // true 이어쓰기 // 자동적으로 파일에 내용을 집어넣을때 발생할 에러를 잡아야함? (자세하지
																// 않음)
			if (file.isFile() && file.canWrite()) { // 이 file이 정말 file인지, 쓸 수 있는지(권한)
				System.out.println("회원 가입을 위해 ID와 비밀번호를 입력하세요.");
				System.out.println("ID : ");
				filewriter.append(sc.nextLine()); // file에 담길 이름
				filewriter.append("\t");

				System.out.println("비밀번호 : "); // 고급 기능 만들어보기 : 꼭 특수문자를 넣어주세요.
				filewriter.append(sc.nextLine());
				filewriter.append("\r"); // 다음 사람을 위해 개행문자

				System.out.println("회원가입이 완료되었습니다.");
			}
			filewriter.close(); // 닫아주기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Login() {
		System.out.println("로그인을 위해 ID와 비밀번호를 입력하세요.");
		System.out.println("ID : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();

		int pass = 0; // 로그인 여부 확인하는 변수 69행

		// 어느 파일에서 가져올지 명령어 file
		File file = new File("C:\\Jworkspace\\00. 프로젝트 (solo)\\src\\com\\camping\\MemberDB.txt");
		try {
			// 읽어올 메소드
			FileReader filereader = new FileReader(file);

			// filereader에서 읽어들인 내용을 가지고 버퍼에 저장할 수 있는 bufferedReader 사용
			BufferedReader bufReader = new BufferedReader(filereader);

			// 이 내용들을 String 변수에 집어 넣고, 끝까지 읽을때까지 반복
			String line = "";

			// bufferedReader가 한줄씩 읽어들임 => line에 넣음 => line이 끝날때 까지 한줄씩 읽어들임
			while ((line = bufReader.readLine()) != null) {

				// line에 담긴 id와 pw의 인덱스(글자 위치)를 뽑아오기, 없다면 -1이 나옴
				int passId = line.indexOf(id); // 로그인 되었는지 안되었는지 판단
				int passPw = line.indexOf(pw);
//				System.out.println(passId + "\t"/*회원가입에서 구분자*/ + passPw); // 확인문
				if (passId != -1 && passPw != -1) {
					System.out.println("로그인 성공!");
					pass = 1;
				}
			}
			if (pass == 0) {
				System.out.println("로그인 실패.");
			}
			bufReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 이거 막 넣으니까 오류나도 뭐때문인지 모르겠다ㅋㅋ
			e.printStackTrace();
		}
	}

}
