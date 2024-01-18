package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> set = new HashSet<>();
		
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");
		set.add("iBATIS");
		
		System.out.println(set.size()); //JAVA중복
//		for(String s: set) {
//			System.out.println(s);
//		}
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			
			if(s.equals("JDBC")) {
				iterator.remove();
			}
		}
		for(String s:set) {
			System.out.println(s);
		}
		
	}
	

}
