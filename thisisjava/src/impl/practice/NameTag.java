package impl.practice;

public abstract class NameTag {
	
	String name;
	int tag;
	
	//번호에 배열놔두고(x) salaryman 일때는 이름 번호 월급 세금
	// 비즈니스맨일때는 이름 번호 총매출액 총비용 세금 
	//세금은 따로 calctax 메소드로 마지막에 계산후 출력
	//배열? 어케함 ?_? ^_' oㅆo
	
	// int arr[] 
	//샐러리맨이면 4 비즈니스맨이면 5
	// 만약 배열이면 샐러리맨 비즈니스맨 따로 배열 길이도 달라지는데
	// 번호는 그냥 100 200 300 400 500 600 이렇게 오르는건가?
	
	public abstract String getName(); 
	



	public abstract void setName(String name);
	



	public abstract int getTag(); 
	




	public abstract void setTag(int tag); 
	

	public abstract double calcTax();
}
