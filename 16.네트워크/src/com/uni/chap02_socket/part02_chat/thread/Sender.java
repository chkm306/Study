package com.uni.chap02_socket.part02_chat.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable{

	private String name; // 데이터를 보내는 사용자 명
	private DataOutputStream out; // 데이터 출력용 스트림
	
	private Scanner sc;
	
	public Sender(Socket socket, String name) {
		this.name = name;
		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		sc = new Scanner(System.in);
		
		while(true) {
			try {
				out.writeUTF(name+" > "+sc.nextLine());
			} catch (IOException e) {
//				e.printStackTrace();
				break;
			}
		}
	}

	
}
