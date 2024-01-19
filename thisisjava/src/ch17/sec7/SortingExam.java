package ch17.sec7;

import java.util.ArrayList;
import java.util.*;

public class SortingExam {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동",30));
		list.add(new Student("신용권",10));
		list.add(new Student("유미선",20));
		
		list.stream()
			.sorted((o1,o2)-> o1.getScore() - o2.getScore())
			.forEach(e->System.out.println(e));
		
		Integer[] arr = {1,3,4,56,45,23};
		Arrays.stream(arr)
			.sorted((o1,o2)->o1 - o2)
			.forEach(e -> System.out.println(e));
		
		
		
	}

}
