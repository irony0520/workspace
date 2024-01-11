package ch07;

public class StudentExam {

	
	public static void personInfo(Person person) {
		//person, student 인스턴스가 들어왔을때
		System.out.println("name: " + person.name);
		person.walk();
		//only student
		if(person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}//객체 타입확인
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("홍길동");
		
		personInfo(p);
		
		System.out.println();
		
		
		Person s = new Student("김길동",10);
		personInfo(s);
	}

}
