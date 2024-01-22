package ch18;

import java.io.Serializable;

public class Member implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1616065040391964919L;
	private String id;
	private String name;
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	public Member(String id, String name) {
		
		this.id = id;
		this.name = name;
	}//@AllArgsConstructor
	
	
}
