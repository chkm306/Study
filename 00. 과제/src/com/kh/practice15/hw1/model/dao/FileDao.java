package com.kh.practice15.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	private Scanner sc = new Scanner(System.in);

	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		
		System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :");
		while (true) {
			// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
			// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감
			// 아닐 경우 sb에 추가

			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			} else {
				sb.append(str);
			}

		}

		// “저장하시겠습니까? (y/n)”
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		// 저장할 파일명을 입력 받음
		System.out.println("저장하시겠습니까? (Y/N)");
		String save = sc.nextLine();

		if (save.equalsIgnoreCase("Y")) {
			System.out.println("저장할 파일명을 입력해주세요 : ");
			String fName = sc.nextLine();

			BufferedWriter bw = null;
			try { // BufferedWriter와 FileWriter 스트림 사용
					// “입력받은 파일명.txt” 파일에 해당 sb 데이터출력
					// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력
				bw = new BufferedWriter(new FileWriter(fName + ".txt"));

				bw.write(sb.toString());

				System.out.println(fName + ".txt 파일에 성공적으로 저장하였습니다.");

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (bw != null)
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				// 열었던 스트림 close
			}
			// 입력 받은 값이 y가 아니면 “다시 메뉴로 돌아갑니다.” 출력하고 메뉴로..
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void fileOpen() {
		// “열기 할 파일명 : “
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		System.out.println("열기 할 파일명 : ");
		String fName = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(fName + ".txt"))) {

			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
		} catch (FileNotFoundException e) {
			// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			// “존재하는 파일이 없습니다.”
			System.out.println("존재하는 파일이 없습니다.");

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			// 열었던 스트림 close
		}
	}

	public void fileEdit() {
		// “수정 할 파일명 : “
		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
		// 스트림 사용

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		StringBuilder sb2 = new StringBuilder();

		System.out.println("수정 할 파일명 : ");
		String fName = sc.nextLine();

		try {
			br = new BufferedReader(new FileReader(fName + ".txt"));

			bw = new BufferedWriter(new FileWriter(fName+ ".txt", true));

			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			// “파일에 추가할 내용을 입력하시오 : “
			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}

			System.out.print("파일에 추가할 내용을 입력하세요 (\"exit\"을 입력하면 내용 입력 끝): ");
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기
			while (true) {
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				} else {
					bw.append(str);
				}
			}

			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”

			System.out.print("변경된 내용을 파일에 추가 하시겠습니까? (Y/N)");
			String edit = sc.nextLine();

			if (edit.equalsIgnoreCase("Y")) {
				bw.write(sb2.toString());
				System.out.println("입력받은 " + fName + ".txt 파일의 내용이 변경되었습니다.");
			} else {
				return;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			// 열었던 스트림 close
		}
	}
}