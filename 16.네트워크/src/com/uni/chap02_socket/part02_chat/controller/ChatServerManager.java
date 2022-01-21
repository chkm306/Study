package com.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.uni.chap02_socket.part02_chat.thread.Receiver;
import com.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatServerManager {
	
	public void startServer() {
	// 서버 이름 정하기
	String name = "Server";
	
	// 1. 포트 번호
	int port = 8500;
	
	// 2. 서버용 소켓 객체 생성 후 포트와 결합
	
	try {
		ServerSocket server = new ServerSocket(port);
		
		// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
		// 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		
		Socket client = server.accept();
		System.out.println("클라이언트와 연결이 되었습니다.");

		// 송수신 작업용 스레드 만들기
		// : 채팅프로그램은 무전기처럼 송신을 받고 수신을 하는것이 아니라 전화기처럼 송신을 받으면서 동시에 수신도 할수있어야
		// 하기때문에 이를 위해 송신과 수신을 별도의 스레드로 처리하면 동시에 처리가 가능하다.

		// 5. 서버가 사용할 송수신 작업용 스레드 생성 후 start()
		Sender sender = new Sender(client, name);
		Thread sth = new Thread(sender);
		
		Receiver receiver = new Receiver(client);
		Thread rth = new Thread(receiver);
		
		sth.start();
		rth.start();
		
		server.close();
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	/*서버의 포트번호 정함
	서버용 소켓 객체 생성
	클라이언트 쪽에서 접속 요청이 오길 기다림
	접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
	연결된 클라이언트와 입출력 스트림 생성
	보조 스트림을 통해 성능 개선
	스트림을 통해 읽고 쓰기
	통신 종료*/}
}
