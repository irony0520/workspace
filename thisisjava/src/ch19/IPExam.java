package ch19;

import java.net.InetAddress;

public class IPExam {

	public static void main(String[] args) {
		
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostAddress());
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress i: naver) {
				System.out.println(i.getHostAddress());
			}
			
		}catch(Exception e) {}

	}

}
