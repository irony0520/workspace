package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UdpServerExam {
	
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {

		System.out.println("-----------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력해주세요.");
		System.out.println("-----------------------------");
		
	start();
		
		Scanner scanner =  new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals('q')) break;
		}
		scanner.close();
		

	}

	private static void start() {
		Thread thread = new Thread() {
			@Override 
			public void run() {
				try {
					datagramSocket = new DatagramSocket(50001);
					System.out.println("UDP서버 시작됨");
					
					while(true) {
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024); //1킬로바이트
						datagramSocket.receive(receivePacket);
						
						executorService.execute(()-> {
							try {
								String newsKind = 
										new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
								SocketAddress socketAddress = receivePacket.getSocketAddress();
								
								for(int i=1;i<=5;i++) {
									String data = newsKind + "뉴스" + i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPacket = new DatagramPacket(bytes,0,bytes.length,socketAddress);
									datagramSocket.send(sendPacket);
								}
							}catch (Exception e) {}
				
						});
					
					}
					
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
		};
		thread.start();
}
	
	private static void stop() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}
	
}
