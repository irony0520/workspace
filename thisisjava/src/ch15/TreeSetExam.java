package ch15;

import java.util.*;

public class TreeSetExam {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(80);
		scores.add(98);
		scores.add(95);
		scores.add(65);
		scores.add(78);
		scores.add(32);
		
		
		for(Integer i : scores) {
			System.out.print(i + ", ");
		}
		
		
		System.out.println();
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(95));
		System.out.println(scores.higher(95));
		System.out.println(scores.floor(95));
		System.out.println(scores.floor(94));
		System.out.println(scores.ceiling(92));
		//System.out.println(scores.pollFirst());  //32 꺼내오면서 제거
		System.out.println(scores.first());
		//System.out.println(scores.pollLast());
		System.out.println(scores.last());
		
//		
//		Iterator<Integer> iterator = scores.descendingIterator();
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next() + ", ");		
//		}
//		System.out.println();
//		NavigableSet<Integer> navi = scores.descendingSet();
//		for(Integer i : navi) {
//			System.out.print(i + ", ");
//		}
		
		//NavigableSet<Integer> navi = scores.descendingSet();
		for(Integer i : scores.descendingSet()) {
			System.out.print(i + ", ");
		}
		System.out.println();
		for(Integer i : scores.headSet(65,true)) {
			
			System.out.print(i+ ", ");
		}//이하 모든값
		
		System.out.println();
		for(Integer i : scores.tailSet(65,true)) {
			
			System.out.print(i+ ", ");
		}//이상
		
		System.out.println();
		for(Integer i : scores.subSet(78,true,98,true)) { //사잇값 - 시작 디폴트: true
			
			System.out.print(i+ ", ");
		}
		
	}
	
	
	
	
}
