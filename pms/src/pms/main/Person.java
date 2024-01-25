package pms.main;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Person {

		private String id;
		private String name;
		private int age;
		private boolean student;
		private Tel tel;
		private String[] skill;
		
		

	

}
