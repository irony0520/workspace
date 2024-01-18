package ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Chapter15Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String,Integer>>entrySet = map.entrySet(); //모든 map.entry객체를 set에 담아서 리턴(그냥외워야됨)
		for(Map.Entry<String,Integer> e : entrySet) {
			if(e.getValue()>=maxScore) {
				name = e.getKey();
				maxScore =e.getValue();				
					
			}
			totalScore += e.getValue();
				
		}
		System.out.println(name + ","+ maxScore+ ","+ (totalScore/map.size()));
	}
}
