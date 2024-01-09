package thisisjava;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int classes = 0;
		int students = 0;
		
		System.out.print("학년을 입력하세요->");
	
		Scanner scanner = new Scanner(System.in);
		classes = scanner.nextInt();
		int height[][] = new int[classes][];
		String names[][] = new String[classes][];
		
		
		for(int i=0;i<classes;i++) {
			System.out.println((i+1) + "학생 수를 입력하세요 ->");
			students = scanner.nextInt();
			scanner.nextLine();
			height[i] = new int[students];
			names[i] = new String[students];
			for(int j=0;j<students;j++) {
				System.out.println((i+1) + "반" + (j+1) + "번 학생의 이름과 키를 입력하세요");
				
				String blank = scanner.nextLine();
				String[] blankArr = blank.split(" "); 
				height[i][j] = Integer.parseInt(blankArr[1]);
				names[i][j] = blankArr[0];
		}
		
	}
		for(int i=0;i<height.length;i++) {
			System.out.print((i+1) + "반 학생들의 키: ");
			for(int j= 0;j<height[i].length;j++) {
				System.out.print(names[i][j] + "(" + height[i][j] + ")");
				if(j<height[i].length-1) {
					System.out.println(", ");
					
				}
				
			
			}
			System.out.println();
		}
		

}
}
