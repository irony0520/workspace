package ch05;

public class ChatAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ssn = "9606241230123";
		char gender = ssn.charAt(6);
		System.out.println(gender);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}

	}

}
