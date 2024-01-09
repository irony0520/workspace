package chapter_3;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean run = true;
		int answer = (int)(Math.random() * 100)+1;
		
	 while(run) {
		 System.out.print("\n숫자를 입력하십시오 ->");
	
	    Scanner scanner = new Scanner(System.in);
		int gNumber = Integer.parseInt(scanner.nextLine()); 	
			
				
		if(answer<gNumber) {	 
		 System.out.print("정답은 해당 숫자보다 작습니다.");		  		
		}
		if(answer>gNumber){
		System.out.print("정답은 해당 숫자보다 큽니다.");	   
		}
		if(gNumber==answer) {
		   
		 System.out.print("정답입니다! 추측 횟수는.. \n계속하시겠습니까?(y,n)");
		 
		
		 String YesOrNo = scanner.nextLine();
		 
		 if(YesOrNo.equals("y")) {
			 run=true;
			 //문자열끼리 비교할땐 .equals("문자")
		 } 
		 if(YesOrNo.equals("n")) {
			 run=false;
		 } 
	 }
	 
  }
	 System.out.print("프로그램 실행 종료");
}
}

	 //while문 안에 반복문을 하나 집어넣고, 안쪽의 반복문은 continue로 반복하는 느낌으로 수정


