package ch16;

public class PersonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		
		person.action(() -> {
			System.out.println("출근을 합니다.");
		});
		
		person.action(() -> 
			System.out.println("퇴근을 합니다.")
		);
		//실행문 1개일경우 중괄호 생략가능 
				
		
		
	}

}
