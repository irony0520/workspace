package ch15;

import java.util.*;

public class DeleteSameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] str = {"apple","banana"};
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();

		
		
//		System.out.println(str[0]);
//		
//		System.out.println(str[0].charAt(0));
//		
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i] + "->");
			for(int j=0;j<str[i].length();j++) {
				char c = str[i].charAt(j); 
				if(set.add(c)) {
					sb.append(c);
				}
				//toCharArray
				
			}System.out.println(sb);
			sb.setLength(0);
			System.out.println(sb);
			//toString
		}
		
		//System.out.println(set); 
		//set.add(str[i].charAt(j)) true false
		
		
		
		

		//?_? XD ^_'

//		for(int i=0; i<str[1].length();i++) {
//			set.add(str[1].charAt(i));
//		}
//		System.out.println(set);
//		
	
		
			
		
	
	}
}
		

//		
//		System.out.println(set); //순서없음
//		
//		for(Character s:set) {
//			System.out.println(s);
//		}
//		System.out.println(sb.append(set));
//	}
//}
//	
