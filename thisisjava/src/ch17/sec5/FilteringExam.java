package ch17.sec5;

import java.util.ArrayList;
import java.util.*;

public class FilteringExam {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");		
		list.add("박자바");
		
		
		list.stream()
			.distinct()
			.forEach( e -> System.out.println(e));
		
		System.out.println();
		
		list.stream()
			.distinct()
			.filter(e-> e.startsWith("신"))
			.forEach(e -> System.out.println(e));
	}
	
	

}
