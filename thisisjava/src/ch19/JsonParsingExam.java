package ch19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingExam {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp2/people.json",Charset.forName("UTF-8")));
		
		String people = br.readLine();
		br.close();

		JSONObject obj = new JSONObject(people);
		JSONArray arr = obj.getJSONArray("people");
		
		Person person1  = parsePerson(arr.getJSONObject(0));		
		Person person2  = parsePerson(arr.getJSONObject(1));
		System.out.println(person1);
		System.out.println(person2);
		
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
