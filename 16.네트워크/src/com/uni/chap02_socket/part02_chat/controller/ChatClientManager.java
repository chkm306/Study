package com.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import com.uni.chap02_socket.part02_chat.thread.Receiver;
import com.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatClientManager {

	public void startClient() {

		String name = "Client";
		
		int port = 8500;
		String serverIp = null;
			try {
				serverIp = InetAddress.getLocalHost().getHostAddress();
			
				System.out.println("Client Start!!");
				
				Socket socket = new Socket(serverIp,port);
				
				// Socket socket = new Socket("192.168.43.203",port);
				
				Sender sender = new Sender(client, name);
				Thread sth = new Thread(sender);
				
				Receiver receiver = new Receiver(client);
				Thread rth = new Thread(receiver);
				
				sth.start();
				rth.start();
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
		// Sender 객체 생성시 매개변수로 socket과 name을 받아온다
		// server에서 생성 : 요청을 수락한 Client의 소켓, 서버명을 받아 올 것이다.
		// client에서 생성 ㅣ 연결된 server의 소켓, 클라이언트 명을 받아 올 것이다.

		// 192.168.43.203
	}
}
