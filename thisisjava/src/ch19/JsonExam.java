package ch19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExam {
	
	public static void main(String[] args) throws IOException {
		
		Person winter = new Person(
				"winter",
				"한겨울",
				25,
				true,
				new Tel("02-123-1234","010-1234-1234"),
				new String[] {"java", "C","C++"}
				);
		
		Person summer = new Person(
				"summer",
				"한여름",
				35,
				false,
				new Tel("02-123-1234","010-1234-1234"),
				new String[] {"java", "Python","C++"}
				);
				
		JSONObject obj1 = createJson(winter);
		JSONObject obj2 = createJson(summer);
		
		JSONObject root = new JSONObject();
		JSONArray people = new JSONArray();
		
		people.put(obj1);
		people.put(obj2);
		
		root.put("people",people);
		
		//System.out.println(obj.toString());
		
		Writer writer = new FileWriter("C:/Temp2/people.json",Charset.forName("UTF-8"));
		writer.write(root.toString());
		writer.flush();
		writer.close();
		
		
	}
	
	private static JSONObject createJson(Person person) {
		JSONObject obj = new JSONObject();
		obj.put("id", person.getId());
		obj.put("name", person.getName());
		obj.put("age", person.getAge());
		obj.put("student", person.isStudent());
		
		JSONObject inner = new JSONObject();
		
		inner.put("home", person.getTell().getHome());
		inner.put("mobile", person.getTell().getMobile());
		
		obj.put("tell",inner);
		
		JSONArray skill = new JSONArray();
		skill.put(person.getSkill()[0]);
		skill.put(person.getSkill()[1]);
		skill.put(person.getSkill()[2]);
		
		obj.put("skill",skill);
		
		return obj;
	}

}
