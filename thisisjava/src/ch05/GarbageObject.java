package ch05;

public class GarbageObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String hobby = "여행";
			hobby = null;


			
			String kind1 = "자동차";
			String kind2 = kind1;
			kind1 = null;
			
			System.out.println(hobby);
			System.out.println(kind2);
			
	}

}
