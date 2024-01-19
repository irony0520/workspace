package ch17.sec4;

import java.util.ArrayList;
import java.util.List;

public class StreamExam {

	public static void main(String[] args) {
	

		List<Product> list = new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			list.add(new Product(i, "상품" +i, "회사",i*10000));
			
		}
		
		list.stream()
			.forEach( (p)-> System.out.println(p));
		
		
	}

}
