package ch08;

public class SmartTelevisionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteCon rc = new SmartTelevisionImpl();
		
		rc.turnOn();
		rc.turnOff();
		
		
		Searchable searchable = new SmartTelevisionImpl();
		//Searchable searchable = (Searchable)rc; 자동 형변환
		
		searchable.search("naver.com");
		
		SmartTelevision st = new SmartTelevisionImpl();
		
		
		st.turnOn();
		st.turnOff();
		st.search("naver.com");
		
		
		}


}
