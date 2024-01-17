package ch13;

public class ApplyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course.registerCourse1(new Applicant<Person>(new Person())); //매개변수 Applicant 클래스타입에 person 넣고 
																	//new Person으로 객체 선언
		
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	

	
		//Course.registerCourse2(new Applicant<Person>(new Person())); //매개변수 Applicant 클래스타입에 person 넣고 
		//new Person으로 객체 선언
	
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		Course.registerCourse3(new Applicant<Person>(new Person())); 
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
	
}
