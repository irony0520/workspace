package ch06.example;

public class Exercise6_6 {
	//두 점 x,y 와 x1,y1간의 거리를 구한다.
	//(x1-x의 제곱)+(y1-y 의 제곱)= 두점의 거리 제곱(직각일때만)
	

	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(((x-x1)*(x-x1)) + ((y-y1)*(y-y1)));
		
			
	}
	
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}

}
