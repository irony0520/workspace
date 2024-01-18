package ch15;

import java.util.HashSet;
import java.util.Set;

public class MemberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Member> set = new HashSet<>();
		
		Member m1 =  new Member("홍길동",30);
		Member m2 =  new Member("홍길동",30); //서로 다른 인스턴스
		
		set.add(m1);
		set.add(m2);
			
		System.out.println(m1.name.hashCode() + " " + m1.age );
		System.out.println(m2.name.hashCode() + " " + m2.age ); //동일 해쉬코드
		System.out.println(m1.equals(m2));
		System.out.println(set.size());  //한개만입력
		
		
		
	}

}
