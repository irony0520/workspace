package pms.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


import org.json.JSONArray;
import org.json.JSONObject;




public class MainProcess {

	private static final Scanner scanner = new Scanner(System.in);
	private static ArrayList<Person> people = new ArrayList<>();
	
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
						System.out.println(String.join(", ", person.getSkill()));		//STring.join(", ",person.Getskill		
					}					
			 		break;
			 		
			 	case 2: {System.out.println("ID : " );
			 	String id = scanner.nextLine();
			 	scanner.nextLine();
			 	System.out.println("Name : " );
			 	String name = scanner.nextLine();
			 	
			 	System.out.println("age : " );
			 	int age = scanner.nextInt();
			 	
			 	System.out.println("Student : " );
			 	boolean student = scanner.nextBoolean();
			 	
			 	System.out.println("Home : " );
			 	String homeTel = scanner.nextLine();
			 	boolean rh = Pattern.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$", homeTel);
			 	if(!rh) {
			 		System.out.println("입력한 데이터가 올바르지 않습니다.");
			 		break;
			 	}
			 	
			 	System.out.println("Mobile : " );
			 	String mobileTel = scanner.nextLine();
			 	boolean rm = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", mobileTel);
			 	if(!rm) {
			 		System.out.println("입력한 데이터가 올바르지 않습니다.");
			 		break;
			 	} 	//전화번호 입력하는곳에서 오류 
			 	System.out.println("Skill : " );
			 	String[] skill = scanner.nextLine().split(",");  //String.split()
			 	
			 	Tel tel2 = new Tel(homeTel, mobileTel);
			 	Person person2 = new Person(id, name, age, student, tel2, skill); 
			 	
			 	people.add(person2);
			 	
			 	System.out.println("데이터가 추가되었습니다.");
			 	}		 	
			 		break;
			 	case 3:	//아이디를 입력받는다
			 		System.out.println("아이디를 입력하세요: ");
			 		String enterID = scanner.nextLine();
			 		
			 		//해당 학생의 정보를 출력
			 		boolean personExsist = false;
			 		for(int i = 0; i<people.size();i++) {
			 			Person person = people.get(i);
			 			if(enterID.equals(person.getId()))  {
			 				
			 				personExsist = true;
			 				System.out.println(person.getId());
							System.out.println(person.getName());
							System.out.println(person.getAge());
							System.out.println(person.isStudent() ? "네" : "아니오");						
							System.out.println(person.getTel().getHome());
							System.out.println(person.getTel().getMobile());
							System.out.println(String.join(", ", person.getSkill()));	
							
							//수정할 필드를 선택
					 		System.out.println("ID를 입력하세요: ");
					 		String id = scanner.nextLine();
					 							 		 					 		
					 		System.out.println("수정할 필드를 입력하세요: ");
					 		String changeField = scanner.nextLine();
					 		switch(changeField) {
					 		case "id":  System.out.println("변경할 id를 입력하세요: ");
					 		String changeId = scanner.nextLine();
					 		person.setId(changeField);
					 		
					 		break;
					 		
					 		case "name":  System.out.println("변경할 이름을 입력하세요: ");
					 		String changeName = scanner.nextLine();
					 		person.setName(changeName);
					 		break;
					 		
					 		case "age":  System.out.println("변경할 나이를 입력하세요: ");
					 		int changeAge = scanner.nextInt();
					 		person.setAge(changeAge);
					 		break;
					 		
					 		case "student":  System.out.println("변경할 학생여부를 예 혹은 아니오로 입력하세요: ");
					 		String changeStudent = scanner.nextLine();
					 		person.setStudent(personExsist);//수정
					 		break;
					 		
					 		case "tel":  System.out.println("변경할 전화번호를 입력하세요: ");
					 		String changeTel = scanner.nextLine();
					 		//person.setTel(changeTel); //수정
					 		break;
					 		
					 		case "skill":  System.out.println("변경할 보유기술을 입력하세요: ");
					 		String changeSkill = scanner.nextLine();
					 		String[] newSkills = changeSkill.split(",");
					 		person.setSkill(newSkills);
					 		break;
							
					 		default:
					 			System.out.println("잘못된 필드를 입력하셨습니다.");
					 			break;
							//3번눌렀는데 왜 삭제됨? ??
					 		}
			 		}			 		
			 	}
			 				 		 		
				 	case 4://아이디를 입력받는다
				 		System.out.println("아이디를 입력하세요: ");
				 		String enterID2 = scanner.nextLine();
				 		 boolean personExist2 = false;
				 	    for (int i = 0; i < people.size(); i++) {
				 	        Person person = people.get(i);
				 	        if (enterID2.equals(person.getId())) {
				 	            personExist2 = true;
				 	            people.remove(i); // 해당 아이디의 사용자를 리스트에서 삭제
				 	            System.out.println("삭제되었습니다.");
				 	            break;
				 	        }
				 	    }
	
				 	    if (!personExist2) {
				 	        System.out.println("존재하지 않는 아이디입니다.");
				 	    }
	
				 	    break;
				 		
				 	case 5:	
				 		System.out.println("프로그램을 종료합니다.");
				 		
	                    try {
	                        // 0.5초 간격으로 콘솔에 "데이터를 저장중입니다..." 출력
	                       // saveThread.join(); // saveThread가 종료될 때까지 기다림
	                        Thread.sleep(500);
	                        System.out.println("데이터를 저장중입니다 . . .");
	                        Thread.sleep(500);
	
	                        // 1초 뒤 모든 인원 정보를 JSON 파일로 저장 후 종료
	                        saveDataToFile();
	                        System.exit(0);
	                    } catch (Exception e) {
	                        e.printStackTrace();
				 		break;}
				 		default:
				 		if(select != 5) System.out.println("잘못 선택하셨습니다.");
	                    }			 	
	                    
		}	
			
	}
		
		private static void saveDataToFile() throws IOException {
	        JSONObject jsonObject = new JSONObject();
	        JSONArray jsonArray = new JSONArray();

	        for (Person person : people) {
	            JSONObject personJson = new JSONObject();
	            personJson.put("id", person.getId());
	            personJson.put("name", person.getName());
	            personJson.put("age", person.getAge());
	            personJson.put("student", person.isStudent());

	            JSONObject telJson = new JSONObject();
	            telJson.put("home", person.getTel().getHome());
	            telJson.put("mobile", person.getTel().getMobile());
	            personJson.put("tel", telJson);

	            personJson.put("skill", new JSONArray(person.getSkill()));
	            jsonArray.put(personJson);
	        }

	        jsonObject.put("people", jsonArray);

	        try (FileWriter fileWriter = new FileWriter("C:/Temp2/people.json")) {
	            fileWriter.write(jsonObject.toString());
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
