package ch19;

import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		
		try {
		Socket socket = new Socket("172.20.20.12",50001);
		System.out.println("[클라이언트] 연결 성공");
		socket.close();
		System.out.println("[클라이언트] 연결 끊음");
		
		}catch(Exception e) {
			
		}
	}

}
