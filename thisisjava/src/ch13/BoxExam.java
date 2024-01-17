package ch13;

public class BoxExam {

	public static <T extends Number> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
	//t =100(정수,Integer) T로 아직 까지 정해지지 않았던것들이 전부 Integer로 바뀐다고생각
	public static void main(String[] args) {
		
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		 
		Box<Double> box3 = boxing(10.2);
		double doubleValue = box3.get();
		System.out.println(doubleValue);
		
		
//		Box<String> box2 = boxing("hello");
//		String stringValue = box2.get();    number형식이라 String 은 불가능
//		System.out.println(stringValue);
		
		// TODO Auto-generated method stub
//		Box<Integer, String> box1 = new Box<>(); //정수가 담길 box 뒤의 Integer는 꺽쇠만 남겨두고 생략가능
//		Box<String, Boolean> box2 = new Box<>(); //문자열이 담길 box
//		
//		
//		box1.content = 100;
//		box1.content2 = "abc";
//		box2.content = "String";
//		box2.content2 = true;
//
//		
//		System.out.println(box1.content);
//
//		System.out.println(box2.content);
		
	}

}
