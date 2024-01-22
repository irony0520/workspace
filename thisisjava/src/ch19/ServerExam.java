package ch19;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam {

	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력해주세요.");
		System.out.println("-----------------------------");
		
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("서버 시작됨");
					
					while(true) {
						System.out.println("[서버] 연결을 기다림");
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						System.out.println("[서버]" + isa.getHostName() + "의 연결을 수락함");
						
						
						socket.close();
						System.out.println("[서버]" + isa.getHostName() + "의 연결을 끊음");
					}
					
				}catch(IOException e) {
					System.out.println("[서버]" + e.getMessage());
				}
			}
		};
		thread.start();
		
		Scanner scanner =  new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals('q')) break;
		}
		scanner.close();
		try {
			serverSocket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
