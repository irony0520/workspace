package pms.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lombok.*;
import org.json.JSONArray;
import org.json.JSONObject;



public class MainProcess {

	private static final Scanner scanner = new Scanner(System.in);
	private static List<Person> people = new ArrayList<>();
	
	public static void main(String[] args) {

		
		
		int select = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Temp2/people.json",Charset.forName("UTF-8")));
			
			String json = br.readLine();
			br.close();

			JSONObject obj = new JSONObject(json);
			JSONArray arr = obj.getJSONArray("people");
			for(int i=0;i<arr.length();i++) {
				JSONObject person = arr.getJSONObject(i);
				people.add(parsePerson(person));
			}
		} catch(IOException e) {
			System.out.println("IOException 발생: " + e.getMessage());
		}
		
		
		while(select != 5) {
			System.out.println("-------------");
			System.out.println("인원 관리 프로그램");
			System.out.println("-------------");
			System.out.println("1.조회 | 2.추가 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("-------------");
			System.out.println("원하시는 메뉴를 선택하십시오 >");
		
			select = scanner.nextInt();
			
			switch(select) {
				case 1:	
					for(Person person : people) {
						System.out.println(person.getId());
						System.out.println(person.getName());
						System.out.println(person.getAge());
						System.out.println(person.isStudent() ? "네" : "아니오");						
						System.out.println(person.getTel().getHome());
						System.out.println(person.getTel().getMobile());
						System.out.println(person.getSkill().toString());				
					}					
			 		break;
			 		
			 	case 2: {System.out.println("ID : " );
			 	String id = scanner.nextLine();
			 	
			 	System.out.println("Name : " );
			 	String name = scanner.nextLine();
			 	
			 	System.out.println("age : " );
			 	int age = scanner.nextInt();
			 	
			 	System.out.println("Student : " );
			 	boolean student = scanner.nextBoolean();
			 	
			 	System.out.println("Home : " );
			 	String homeTel = scanner.nextLine();
			 	
			 	System.out.println("Mobile : " );
			 	String mobileTel = scanner.nextLine();
			 			 	
			 	System.out.println("Skill : " );
			 	String skill = scanner.nextLine();  //String.split()
			 	
			 	Tel tel2 = new Tel(homeTel, mobileTel);
			 	Person person2 = new Person(id, name, age, student, homeTel, mobileTel, skill); 
			 	
			 	people.add(person2);
			 	
			 	System.out.println("데이터가 추가되었습니다.");
			 	}		 	
			 		break;
			 	case 3:	//아이디를 입력받는다
			 		System.out.println("아이디를 입력하세요: ");
			 		String enterID = scanner.nextLine();
			 		
			 		//해당 학생의 정보를 출력
			 		for(Person person : people) {
			 			if(enterID.equals(person.getId()))  {
			 				System.out.println(person.getId());
							System.out.println(person.getName());
							System.out.println(person.getAge());
							System.out.println(person.isStudent() ? "네" : "아니오");						
							System.out.println(person.getTel().getHome());
							System.out.println(person.getTel().getMobile());
							System.out.println(person.getSkill().toString());	
			 			}
			 			
			 		}
			 		
			 		//수정할 필드를 선택
			 		System.out.println("수정할 필드를 입력하세요: ");
			 		String changeField = scanner.nextLine();
			 		switch(changeField) {
			 		case "id":  System.out.println("변경할 id를 입력하세요: ");
			 		String changeId = scanner.nextLine();
			 		
			 		case "name":  System.out.println("변경할 이름을 입력하세요: ");
			 		String changeName = scanner.nextLine();
			 		
			 		case "age":  System.out.println("변경할 나이를 입력하세요: ");
			 		int changeAge = scanner.nextInt();
			 		
			 		case "student":  System.out.println("변경할 학생여부를 예 혹은 아니오로 입력하세요: ");
			 		String changeStudent = scanner.nextLine();
			 		if(changeStudent.equals("예")) {
			 			changeStudent = true;
			 		}else {
			 			. false;
			 		}
			 		case "tel":  System.out.println("변경할 전화번호를 입력하세요: ");
			 		int changeTel = scanner.nextInt();
			 		
			 		case "skill":  System.out.println("변경할 보유기술을 입력하세요: ");
			 		String changeSkill = scanner.nextLine();
			 		}
			 		//tel, skill 항목은 여러개 
			 		// 잘못 입력한 경우 설정 ??			 			 				 		
			 		break;
			 		
			 	case 4://아이디를 입력받는다
			 		System.out.println("아이디를 입력하세요: ");
			 		String enterID2 = scanner.nextLine();
			 		
			 		//아이디가 데이터 상에 존재하지 않으면 ?
			 		break;
			 	case 5:	
			 		break;
			 		default:
			 		if(select != 5) System.out.println("잘못 선택하셨습니다.");
			}			 	
		}			
	}
	
	private static Person parsePerson(JSONObject obj) {
		
		JSONObject tel = obj.getJSONObject("tell");		
		JSONArray skill = obj.getJSONArray("skill");
		String[] arr = new String[skill.length()];								
		for(int i =0;i<skill.length();i++) {
			arr[i] = skill.getString(i);
			
		}
		
	return new Person(
				obj.getString("id"),
				obj.getString("name"),
				obj.getInt("age"),
				obj.getBoolean("student"),
				new Tel(tel.getString("home"),tel.getString("mobile")),
				arr
			);
				
	}
	
	
}
