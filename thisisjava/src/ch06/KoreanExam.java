package ch06;

public class KoreanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korean person1 = new Korean("123456-1234567","홍길동");
		
		System.out.println("국적 : " + person1.nation);
		System.out.println("주민등록번호 : " + person1.ssn);
		System.out.println("이름 : " + person1.name);
		//person1.nation = "미국";
	}

}
