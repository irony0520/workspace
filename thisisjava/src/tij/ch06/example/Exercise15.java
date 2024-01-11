package tij.ch06.example;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MemberService memberService = new MemberService();
		
		boolean result  = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
	
		}else {
			System.out.println("");
		}
		
		
		
		
	}

}
