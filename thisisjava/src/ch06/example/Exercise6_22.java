package ch06.example;

public class Exercise6_22 {

	static boolean isNumber(String str) {
		int num=0;
		for(int i=0;i<str.length();i++) {
			char NumOrStr = str.charAt(i);
		 num = Character.getNumericValue(NumOrStr);}
		if(num == 1) {
			return true;
		}
		else if(num == 2 ) {
			return true;
		}
		else if(num == 3 ) {
			return true;
		}
		else if(num == 4 ) {
			return true;
		}
		else if(num == 5 ) {
			return true;
		}
		else if(num == 6 ) {
			return true;
		}
		else if(num == 7 ) {
			return true;
		}
		else if(num == 8 ) {
			return true;
		}
		else if(num == 9 ) {
			return true;
		}
		else {
			return false;
		}	
	}	
		
		//char NumOrStr;
		 
//		for(int i=0;i<str.length();i++) {
//			str.charAt(i); 
//			if(s)
//			
//		}
//		return sc;
//		
		
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str) );
		
		str = "1234o";
		System.out.println(str +"는 숫자입니까?" +isNumber(str));
	}
}
