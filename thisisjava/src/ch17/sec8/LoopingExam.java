package ch17.sec8;

import java.util.Arrays;

public class LoopingExam {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		
	boolean sum = Arrays.stream(intArr) 
		.filter( e -> e%2 ==0)
			.peek(e -> System.out.println(e))
			.noneMatch( e -> e%2!=0);
	System.out.println(sum);
		
		int[] arr = {2,4,6,8,10};
		boolean b = Arrays.stream(arr)
			.allMatch(e -> e%2==0);
			System.out.println(b);
			
		}
		
		

	

}

