package thisisjava;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
//	System.out.println(Math.PI);
		// TODO Auto-generated method stub
//		short  b =10;
//		byte s = b;
	
//		System.out.printf("%1$d %2$d",10 ,20);
//		System.out.printf("%d\n %s\n %f\n", 100, "str", 1.23);
		
//		
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		int a =	Integer.parseInt(str);
		
		int asdf = 123;
		System.out.printf("상품의 가격:%d원\n", asdf);
		System.out.printf("상품의 가격:%6d원\n", asdf);
		System.out.printf("상품의 가격:%-6d원\n", asdf);
		System.out.printf("상품의 가격:%06d원\n", asdf);
		System.out.print("\n원의 반지름을 입력하세요 ->");
		Scanner scanner = new Scanner(System.in);
		int inputData = Integer.parseInt(scanner.nextLine()); 
		//정수로 바꿔줘야됨
		double area = Math.PI*inputData*inputData;
		//Math.PI하고 세미콜론 붙이면 안됨 Math.pow(값,지수)
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f", 10,area);}}
		//큰따옴표 안에 변수 인식못함
		
	
		//		
	
//	
//int v1 = 1;
//  System.out.println("v1:" + v1);
//  
//if(true) {
//	int v2 = 2;
//	if(true) {
//		int v3=2;
//		System.out.println("v1:" +v1);
//		System.out.println("v2:" +v2);
//		System.out.println("v3:" +v3);
//	}
//}

