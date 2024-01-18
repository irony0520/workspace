package ch13;

public class FruitsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits<Apple<Integer>> f1 = new Fruits<>(); //뒤에는 생략가능 
		f1.set(new Apple<Integer>(101));   //string을 타입으로 가지는 apple을 타입으로 가지는 Fruits
		Fruits<Banana> f2 = new Fruits<Banana>();
		f2.set(new Banana());
		
		Apple<Integer> apple = f1.get(); //강제 형변환, instance of 를 쓸 필요가 없어짐
		Integer applesName = apple.name;
		System.out.println(applesName);
		Banana banana = f2.get();
		
//		Integer i = Fruits.<Integer>method1(12); //제네릭 메소드의 경우 명시하는 부분이 다름
//		Integer i2 = Fruits.method1(12); //생략가능
//		System.out.println(i);
//		System.out.println(i2);
		Fruits <String> f3 = new Fruits<>();
		String str = f3.method2("hello");
		System.out.println(str);
		
		
	}
	//제네릭클래스는 인스턴스가 만들어질때 타입이 결정된다
	//->제네릭 클래스는 static에선 사용불가
}
