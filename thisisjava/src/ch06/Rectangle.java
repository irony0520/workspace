package ch06;

public class Rectangle {

//	
//	int width = 30;
//	int height = 30;
//	
	
	
	Rectangle () {
		System.out.println("객체가 생성..");
	}
//	
//	Rectangle(int a) {
//		
//	}
//  //생성자가 하나도 없을시 자동으로 생성(바이트코드)
	//생성자를 만들었을 경우 그에 맞는 매개변수를 삽입해줘야함
	
//	void rec() {
//		System.out.println("dfdfd");
//	}
	
	void round(int width,int height) {
//		System.out.println("생성..");
		System.out.println("가로가 " + width + ", 세로가 " + height +"인 직사각형의 둘레 : " + (width+height)*2);
		
	}
	
	void area(int width,int height) {
		System.out.println("가로가 " + width + ", 세로가 " + height +"인 직사각형의 넓이 : " + (width*height));
	}
	

	void area(double width,double height) {
		System.out.println("가로가 " + width + ", 세로가 " + height +"인 직사각형의 넓이 : " + (width*height));
	}
	
	

	
	
//      String round(int x,int y) {
//		
//		return "가로가" + x + ", 세로가" + y +"인 직사각형의 둘레 :" + (x+y)*2;
//	
	
//	String drive(String name) {
//		return name + "을 태우고 " + this.speed + "의 속도로 출발합니다. ";
//	}
	
//	("가로가" + width + ", 세로가" + height +"인 직사각형의 둘레 :" + (width+height)*2);
	
	
}


