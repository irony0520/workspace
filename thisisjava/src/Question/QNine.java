package Question;

import java.util.Scanner;

public class QNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
		int classes = 0;
	// int scores 변수 필요없이 array[i]로 사용
		double avg = 0;
		
		int array[] = null; //정해지지 않았을때 배열 선언 방식 2차 배열은 int array[][] = new int[classes][];이런식으로
	
		
		do {
		System.out.print("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");	 
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n선택 -->");	
		number = scanner.nextInt(); 
		//scanner.nextLine();  enter입력될걸 생각해서 nextInt다음엔 nextline써주면 좋다 
		
		
		switch(number) {
		case 1: 
		System.out.print("학생수-->");
		classes = scanner.nextInt(); 
		array = new int[classes]; //classes가 입력된 후 배열 선언 int array[] = new int [classes]로 선언해버리면 
		//classses 가 0
		
		break;
		
		case 2:
			
			for(int i = 0; i<classes;i++) {
				System.out.print("scores[" + i+ "]> ");
				array[i] = scanner.nextInt(); //배열안을 채워줌 nextInt 적을때 변수명이 아닌 이런 형태도 사용가능
				
			}
			break;
			
				
		case 3: 
			
			for(int i = 0; i<classes;i++) {
				System.out.println("scores[" + i + "] :" + array[i] );
			
			}
			break;
		case 4: 
			int max = array[0];
			for(int i = 0; i<classes;i++) {
				
				if(max < array[i]) {

					max = array[i];}
				
				
				sum += array[i];
				avg += 1;
			}
			System.out.println("최고 점수:" + max);
			System.out.println("평균 점수:" + sum/avg);
			break;
			
		case 5:
			System.out.println("프로그램 종료");
			break;
			
				
		}
		
		}while(number!=5);
	}

}
