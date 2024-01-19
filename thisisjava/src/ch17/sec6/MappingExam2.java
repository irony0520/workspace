package ch17.sec6;

import java.util.*;

public class MappingExam2 {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr)
			.asDoubleStream() //원시타입
			.boxed() 	 	 //Double wrapper 객체 
			.forEach( e -> System.out.println(e));
	}

}
