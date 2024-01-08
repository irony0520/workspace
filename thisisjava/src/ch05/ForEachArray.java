package ch05;

import java.util.Scanner;

public class ForEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int classes = 0;
		int students = 0;
		//int height = 0;
		
		System.out.print("학급 수를 입력하세요-->");
		
		Scanner scanner = new Scanner(System.in);
		classes = scanner.nextInt();
		int heights [][] = new int[classes][]; //[{], {}, {]]
		String names[][]  = new String[classes][]; //내부 배열은 나중에 지정가능
		for(int i =0;i<classes;i++) {
			System.out.print((i+1) + "반 학생 수를 입력하세요-->");
			students = scanner.nextInt();
			scanner.nextLine(); //enter가 입력되기 때문에 버퍼에 남은 enter값을 버려준다
			heights[i] = new int[students];
			names[i] = new String[students];
			
			for(int j =0;j<students;j++) {
				System.out.print((i+1) +"반"+ (j+1) +"번 학생의 이름과 키를 공백으로 구분하여 입력하세요-->");
				
				String temp = scanner.nextLine();
				String[] tempArr = temp.split(" "); //이름, 키 문자열을 배열처리 split로 나눠줌
				heights[i][j] =Integer.parseInt(tempArr[1]);
				names[i][j] = tempArr[0];
				
				
//				names[i][j]= scanner.nextLine();
//				heights[i][j] = scanner.nextInt();
				//split함수 
			
			}
		}
		
		
		for(int i =0;i<heights.length;i++) {
			//System.out.println();
			for(int j =0;j<heights.length;j++) {
				if(j<=heights.length-1) {
					System.out.println((i+1)+"반 학생들의 키:" +names[i][j] + "(" + heights[i][j] + ")");
					break; //
					
				}
			
				else {
				System.out.println((i+1)+"반 학생들의 키:" +names[i][j] + "(" + heights[i][j] + ") ," );
				}
			}
		} 
	}
}
		
		
			
			
		
		
	
		
		
		