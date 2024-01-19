package ch16;

public class LamdaExam {

	public static void main(String[] args) {
		
//		Computer com2 = get(()-> {
//			return new Computer();
//		});
		
		Computer com2 = get(Computer :: new);
		
		Computer com = new Computer();
		
		
		//
//		action(3.0,3.5,(x,y) -> { 
//			return com.instanceMethod(x, y)
//		}); //x,y 매개변수 값에 변화를 줄 경우 이렇게 작성
		
		action(3.0 , 3.5, com:: instanceMethod);
	
		
		action(5.0,5.0,(x , y) -> { 
			return Math.pow(x,y);
		});
		
		//action(5.0,5.0,Math::pow); 

		action(10.0,5.0,(x , y) -> { 
			return Math.pow(x,y);
		});
		//action(10.0,5.0,(x , y) ->x-y);
	}

	
	public static void action(double x, double y ,Calculable calculable) {
		System.out.println("메서드 실행");
		System.out.println(calculable.calculate(x, y));
		System.out.println("메서드 종료");
	}
	
	public static Computer get(Creatable creatable) {
		return creatable.create();
	}
	
}
