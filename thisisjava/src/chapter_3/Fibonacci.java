package chapter_3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("피보나치 수->");
		Scanner scanner = new Scanner(System.in);
		int fNumber = Integer.parseInt(scanner.nextLine());
		
			
		int sum = 0;
		int a = 0;
		int b = 1;
		if(fNumber ==1) {
			System.out.println(0);
		}else if(fNumber ==2) {
			System.out.println(1);
		}
		
		 else {
	    for(int i =3;i<=fNumber;i++) {
		
		   sum= a+b;
		   a=b;
		   b=sum;
	
		
	}
	System.out.println(sum);
		
		
			}		
 
}
}
	
		
//		
//		
//		if(fNumber ==1) {
//			System.out.println(0);
//		}		
//		else if(fNumber==2) {
//		System.out.println(1);
	
//		else if(fNumber>=3) {
//			System.out.println();
//		}
//		
		
		
		
		
	


//if문으로 첫번째, 두번쨰는 0,1로 고정하고 
//else에 for문 집어넣기    ?
//
//for문 
//int i=0,i<=number.length,i++
//sum = num[i-2] +num[i-1]?
//		

