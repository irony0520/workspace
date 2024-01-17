package ch13;

public class Course {

	
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getName()+ "이(가) 코스1을 등록함");
	}//? 와일드카드 넣을시 모두 지원가능(person)이면 다 
	

	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getName()+ "이(가) 코스2을 등록함");
	}//학생만 가능
	

	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getName()+ "이(가) 코스3을 등록함");
	}//worker의 부모들만 가능(super)
	
	
	
	
}
