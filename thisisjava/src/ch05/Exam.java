package ch05;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = "abc";
		
		
		System.out.println("Str1's hashcode: " + str1.hashCode());
		System.out.println("Str2's hashcode: " + str2.hashCode());
		System.out.println("Str3's hashcode: " + str3.hashCode());
		System.out.println("Str4's hashcode: " + str4.hashCode());
	  	
	}
		private static boolean equals2(String origin, String str) {
			return origin.hashCode() == str.hashCode();
		}
	

}
