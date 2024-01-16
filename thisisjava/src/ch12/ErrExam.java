package ch12;

import java.io.IOException;


public class ErrExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int speed = 0;
		int keyCode = 0;

		while(true) {
//		System.in.read()
			if(keyCode != 10 && keyCode!= 13) {		
				if(keyCode== 49) {
					speed++;
					System.out.println("현재 속도 = " + speed);
					
				}else if(keyCode == 50) {
					speed--;
					System.out.println("현재 속도 = " + speed);
					
				}else if(keyCode == 51){
					System.out.println("프로그램 종료");
					break;
				}
				System.out.println("-------------------");
				System.out.println("1. 증속 2. 감속 3. 중지" );			
				System.out.println("-------------------");	 
				System.out.println("선택: ");
				
			}
			
			keyCode = System.in.read();	
			//1 enter --> (아스키코드) 49/10 13 49가 먼저 들어간 후 반복문
		}
	
	}
}		
		
				
		
					
			
		
			
//			};								
//			switch(keyCode)	{ 
//			
//			case 49: System.out.println(speed++);
//					break;
//			case 50: System.out.println(speed--);
//					break;
//			case 51: System.out.println("프로그램 종료");
//					break;
//			}
 
//			try {
//			int value = Integer.parseInt("1oo");
//			}catch(NumberFormatException e) {
//				System.err.println("[에러 내용]");
//				System.err.println(e.getMessage());
//			}		

 




