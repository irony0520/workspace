package ch15;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrangedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,4,7,3,5,5,4,3,1,6};
		
		Set<Integer> set = new TreeSet<>();
		
		List<int[]> list = Arrays.asList(nums);
						
		for(Integer i : nums) {
			set.add(i);
			
		}
		
		System.out.println(set);
	}
}


