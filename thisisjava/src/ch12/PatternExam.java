package ch12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
		
	boolean tf = Pattern.matches("(02|010)-\\d{3,4}-\\d{4}","010-1234-5678");
	boolean tf1 = Pattern.matches("\\w+@\\w+\\.\\w+","afdasdfa@naver.com");
	System.out.println(tf);
	System.out.println(tf1);
	System.out.println("(02|010)-\\d{3,4}-\\d{4}");
	;
	
	String emailEnter;
	String pNumber;
	String email = 	"\\w+@\\w+\\.\\w+";
	
	String pNumberEnter = "(02|010)-\\d{3,4}-\\d{4}";
	//boolean tf2 =Pattern.matches(email,"afdasdfa@naver.com");
		
		while(true) {
			System.out.println("이메일을 입력해주세요: ");
			//emailEnter = scanner..args.
		
		if(Pattern.matches(email,emailEnter)) {
			
			emailEnter = scanner.nextLine();
			//if break 
		}else {
			System.out.println("잘못입력하셨습니다.");
			}
		}
	
//
//		System.out.println("전화번호를 입력해주세요: ");
//		pNumber = scanner.nextLine();
	
	
	}
	
}
