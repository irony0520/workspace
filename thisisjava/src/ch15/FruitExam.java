package ch15;

import java.util.Comparator;
import java.util.TreeSet;

public class FruitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Fruit> fruit = new TreeSet<>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
			//return o1.price-o2.price; 오름차순
			return o2.price - o1.price;
			}//익명 구현 객체(1회성), 제네릭 추가
				});
		
		fruit.add(new Fruit("포도",3000));
		fruit.add(new Fruit("수박",10000));
		fruit.add(new Fruit("딸기",6000));
		
		for(Fruit f : fruit) {
			System.out.println(f.name + " : " + f.price);
		}
	}

}
