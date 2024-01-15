package ch12;

public class MemberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m = new Member("test","홍길동",32); //기본생성자
//		m.setId("test"); //getter setter 
//		m.setName("홍길동");
//		m.setAge(32);
		System.out.println(m); //toString() 
	
		
		Member m2 = new Member("test","홍길동",32); //AllArgsConstructor
		
		if(m.equals(m2)) System.out.println("동등합니다");
		if(m.hashCode() == m2.hashCode()) System.out.println("동등합니다");
		
	}
	
		

}
