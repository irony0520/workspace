package ch15;

import java.util.ArrayList;

public class ArrayListExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>(); 
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(3,35); //2번 인덱스에 35추가 - 30, 40 사이에 끼어들어감
		arr.set(3,36); //35를 덮어씀
		
		
		
//		System.out.println(arr.contains(40));
//		System.out.println(arr.contains(41));
//		System.out.println(arr.isEmpty());
//		System.out.println(arr.size());
//		arr.clear();
//		System.out.println(arr.isEmpty());
		
		System.out.println(arr.remove(3));
		//System.out.println(arr.remove(new Integer(36));
		
		
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		System.out.println(arr.get(2));
		
	}

}
