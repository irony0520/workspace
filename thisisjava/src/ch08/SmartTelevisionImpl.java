package ch08;

public class SmartTelevisionImpl implements SmartTelevision{
//RemoteCon, Searchable 2개를 구현할 필요없다
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 킵니다");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원을 끕니다");
	}
	

}
