package ch15;

import java.util.TreeSet;

public class PersonExam {

	public static void main(String[] args) {
		
		
		TreeSet<Person> ts = new TreeSet<>();
		
	   ts.add(new Person("홍길동",45));
	   ts.add(new Person("김자바",25));
	   ts.add(new Person("박지원",31));

	   for(Person p : ts ) {
		   System.out.println(p.name + " : " + p.age);
	   }
	}

}
