package ch15;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		//return o1.price-o2.price; 오름차순
		return o2.price - o1.price;
	}

}
