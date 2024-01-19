package ch17.sec13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelExam {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		List<Integer> scores = new ArrayList<>();
		
		for(int i=0;i<100000000; i++) {
			scores.add(random.nextInt(101));
			
		}
		
		
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		
		startTime = System.nanoTime();
		scores.stream()	
			.mapToInt( i -> i.intValue())
			.average()
			.getAsDouble();
		
		endTime = System.nanoTime();
		time = endTime-startTime;
		System.out.println(time);
		
		startTime = System.nanoTime();
		scores.parallelStream()	
			.mapToInt( i -> i.intValue())
			.average()
			.getAsDouble();
		
		endTime = System.nanoTime();
		time = endTime-startTime;
		System.out.println(time);

	}
	
	
	

}
