package ch06;

public class CarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car1 = new Car();
 		Car car2 = new Car(); //서로 다른 자동차 인스턴스 
 		Car car3 = new Car();
 		
// 		car1.gas = 10;
// 		car2.gas = 20;
// 		car1.gas = 30;
 		//Car.gas = 10;
// 		
// 		System.out.println("car1.gas:" + car1.gas );
// 		System.out.println("car2.gas:" + car2.gas );
// 		System.out.println("car3.gas:" + car3.gas );
 		Car.printGas();
		//공유 x ->독립적인 멤버(인스턴스멤버)
 		//static 클래스멤버 설정시 공유
	}

}
