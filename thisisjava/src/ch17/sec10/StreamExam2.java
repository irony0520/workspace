package ch17.sec10;

import java.util.ArrayList;
import java.util.List;

public class StreamExam2 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",92));
		list.add(new Student("신용권",95));
		list.add(new Student("김자바",98));

		int sum1 = list.stream()
						.mapToInt(Student :: getScore)   //1, 메소드 참조 2.인스턴스 하나만 
						.sum();
		
		int sum2 = list.stream()
				.mapToInt(Student :: getScore)   
				.reduce((a,b)-> a+b) //reduce의 매개변수가 람다식 하나면 optional 반환
				.orElse(0);          //orElse로 디폴트 값 선언
		System.out.println(sum2);
	
		
		int sum3 = list.stream()
				.mapToInt(Student :: getScore)   
				.reduce(0,(a,b)-> a+b);  //리턴타입 그대로 반환, sum2와 똑같음
				
		System.out.println(sum3);
	}
	
	

}
