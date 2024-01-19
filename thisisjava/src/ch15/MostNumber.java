package ch15;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,4,7,3,5,5,4,3,1,6};
		Map<Integer,Integer> map = new HashMap<>();
		
		
			for(int i =0;i<nums.length;i++) {
				map.put(nums[i], map.getOrDefault(nums[i], 0)+1);   
			}
	
			
		
		for(Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" +e.getValue());				
			}
		
			int max = nums[0];
		for(int num : nums) {
			if(num >=max) {
				num=max;
			} //익명구현객체사용가능
		}System.out.println("\n가장 많이 등장한 숫자는 : " + max);
			
		
	
	
	
	}
}
		
//System.out.println(map);

//Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//Iterator<Entry<Integer, Integer>> entryIterator = entrySet.iterator();
//while(entryIterator.hasNext()) {
//	Entry<Integer,Integer> entry = entryIterator.next();
//	Integer i = entry.getKey();
//	Integer i2 = entry.getValue();		
//	System.out.println(i + ":" + i2);
//}



//for(int i = 0; i<nums.length;i++) {
//	if(map.containsKey(nums[i])) {
//		
//	}

 





//Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//Iterator<Entry<Integer, Integer>> entryIterator = entrySet.iterator();
//while(entryIterator.hasNext()) {
//	Entry<Integer,Integer> entry = entryIterator.next();
//	Integer i = entry.getKey();
//	Integer i2 = entry.getValue();
//	
//	System.out.println(i + " " + i2);



//System.out.println(map.get(nums));
//for(Integer i: nums) {
//	map.put(i, i);
//}
//
//System.out.println(map.get(nums[1]));
	//getOfdefault 활용 map.get(nums[1],1)