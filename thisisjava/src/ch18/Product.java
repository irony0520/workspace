package ch18;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Product implements Serializable{

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6391872734537673243L;
	public static String company = "SAMSUNG";
	private String name;
	private int price; 
	private transient int pid;  //직렬화에서 제외
	
}
