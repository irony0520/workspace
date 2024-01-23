package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class UDPClientExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			while(true) {
				System.out.print("구독할 뉴스 주제를 입력하세요. 종료를 원하면 q를 입력");
				String data = scanner.nextLine();		
				if(data.toLowerCase().equals("q")) {
					System.out.println("종료됨");
					break;}
				byte[] bytes = data.getBytes("UTF-8");
				DatagramPacket sendPacket = new DatagramPacket(bytes,bytes.length,new InetSocketAddress("localhost",50001));
				datagramSocket.send(sendPacket);
				
				while(true) {
					DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024);
					datagramSocket.receive(receivePacket);
					
					String news = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
					System.out.println(news);
				
					if(news.contains("뉴스5")) {
						break;
					}
					
				}	
			}
			datagramSocket.close();
		}catch(Exception e) {
			
		}
				
	}
		
}



