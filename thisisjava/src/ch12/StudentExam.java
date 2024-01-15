package ch12;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		Student s3 = new Student(1,"김자바");
		
		if(s1.equals(s2)) {
			System.out.println("두 객체는 동등하게 취급됩니다.");
		}
		else {
			System.out.println("두 객체는 다르게 취급됩니다. ");
		}
		
		if(s1.hashCode()== s2.hashCode()) {
			System.out.println("두 객체는 동등하게 취급됩니다.");
		}
		else {
			System.out.println("두 객체는 다르게 취급됩니다. ");
		}
		
		
		System.out.println(s1);
		System.out.println(s1.toString()); //println(String)
		System.out.println(s2);  //println(Object) --> 객체의 tostring메서드를 내부에서 호출
		System.out.println(s3);
	
 //id값을 비교해서 s1 != s2 , s1 == s3 로 인식

		StudentRecord sr = new StudentRecord(1,"홍길동");
		System.out.println(sr.id());
		System.out.println(sr.name());
		System.out.println(sr.toString());
		
		StudentRecord sr2 = new StudentRecord(1,"홍길동");
		System.out.println(sr.equals(sr2));
		System.out.println(sr.hashCode() == sr2.hashCode());
		
	}
}
