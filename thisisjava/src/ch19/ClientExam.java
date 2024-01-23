package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		
		try {
		Socket socket = new Socket("172.20.20.12",50001);
		System.out.println("[클라이언트] 연결 성공");
		
		
		String sendMessage = "서버에게 보낼 메세지";
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		dos.writeUTF(sendMessage);
		dos.flush();
	
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String receiveMessage = dis.readUTF();
		System.out.println("서버로 부터 받은 메세지 :" + receiveMessage);
		
		
		socket.close();
		System.out.println("[클라이언트] 연결 끊음");
		
		}catch(Exception e) {
			
		}
	}

}
