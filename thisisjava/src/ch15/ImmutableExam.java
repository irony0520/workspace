package ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExam {

	
	public static void main(String[] args) {
		
		List<String> li = List.of("A","B","C");
		//li.add("D"); (불가능)
		
		Set<String> s1 = Set.of("A","B","C");
		
		Map<String,Integer> m1 = Map.of(
				"A",1,
				"B",2,
				"C",3);
		
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		List<String> list2 = List.copyOf(list);
		//list2.add("D"); 복사된 컬렉션은 수정불가능
		
		String[] arr = {"A","B","C"};
		List<String> list3 = new ArrayList<>();
		
		for(String s : arr) {
			list3.add(s);
		}
		
		
		
	}
}
