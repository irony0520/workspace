package ch06;

public class Calculator {

	//불리안

	boolean power = false;
	
	void powerOn() {
		this.power = true;
		System.out.println("전원을 켭니다.");
	}
	//메소드 생성 void라 리턴값 없어도 됨
	
	void powerOff() {
		this.power = false;
		System.out.println("전원을 끕니다.");
	}
	
	
	int plus(int x, int y) {
		int result = 0;
		if(power) {
			result = x+y;
			
		}
		else { 
			System.out.println("전원이 꺼져있습니다.");
		}
		return result;
	}
	
	
	double plus(double x, double y) {
		double result = 0;
		if(power) {
			result = x+y; //다 더블로 바꿔줘야됨 실수 더하기 구현
			
		}
		else { 
			System.out.println("전원이 꺼져있습니다.");
		}
		return result;
	}
	
	
	int minus(int x, int y) {
		int result = 0;
		if(power) {
			result = x-y;
		}
		else { 
			System.out.println("전원이 꺼져있습니다.");
		}
		return result;
	}
	
	
	int sum(int ...values) {
		int result = 0;
		for(int v :values) {
			result += v;			
		}
		return result;
	}
	//배열로 전환되어서 입력됨
	
	//int sum(int ...values) == int sum(int[] values)
	
	
	
	
}
