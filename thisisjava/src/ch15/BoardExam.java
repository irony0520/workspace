package ch15;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Board> list = new ArrayList<>(); //ctrl shift o
		
		
		list.add(new Board("제목1","내용1","글쓴이 1"));
		list.add(new Board("제목2","내용2","글쓴이 2"));
		list.add(new Board("제목3","내용3","글쓴이 3"));
		list.add(new Board("제목4","내용4","글쓴이 4"));
		list.add(new Board("제목5","내용5","글쓴이 5"));
		
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		
		for(int i =0;i<size;i++) {
			System.out.println("요소" + i + "번" + list.get(i) );
		}//toString
		
		for(Board b : list) {
			System.out.println(b);
		}
		
	}

}
