package ch12;

import lombok.*;


//@AllArgsConstructor //모든 매개변수 가능한 생성자
//@NoArgsConstructor //매개변수 없는 생성자
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString

public class Member {
	
	
	
	private final String id;
	private final String name;
	private final int age;
	
	//@NonNull(초기화는 강제지만 나중에 값바꾸기가능)   final(불변) 
	
	
}
