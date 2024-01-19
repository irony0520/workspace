package ch15;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxValue = 0;
		Character maxChar = null;//TQ
		
		String str = "hi, my name is donghee.nice to meet you";
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			
		}
		map.remove(' ');
		
		for(Entry<Character,Integer> e: map.entrySet()) {		
			System.out.println(e.getKey() + ":" + e.getValue() );
			if(e.getValue()>maxValue) {//수정
				maxValue = e.getValue();
				maxChar = e.getKey();
				
			}
		}System.out.println("가장 많이 등장한 문자: " + maxChar);
		
		
//		int max = 0;
//		for(int num : map.values()) {
//			if(num >=max) {
//				num=max;
//
//	 
	
//		Comparator<Entry<Character,Integer>> comparator = new Comparator<>();
		
		
	}
}
