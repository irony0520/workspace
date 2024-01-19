package ch17.sec10;

import java.util.Arrays;

public class StreamExam {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		
		long count = Arrays.stream(arr)
			.filter(e -> e%2==0)
			.count();
			System.out.println(count);
		
		long sum = Arrays.stream(arr)
			.filter(e -> e%2==0)
			.sum();
			System.out.println(sum);
			
		double avg = Arrays.stream(arr)
			.filter(e -> e%2==0)
			.average()
			.getAsDouble();
			System.out.println(avg);
			
		int max =  Arrays.stream(arr)
			.filter(e -> e%2==0)
			.max()
			.getAsInt();
		System.out.println(max);
		
		int first =  Arrays.stream(arr)
				.filter(e -> e%2==0)
				.findFirst()
				.getAsInt();
			System.out.println(first);
			
		//Optional 값이 없을때 Null 에러에 취약함을 보안하려고 (Nullpointexception)
	}
	
	

}
