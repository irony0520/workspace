package ch08;

public class ServiceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service service = new ServiceImpl();
		service.defaultMethod1();
		service.defaultMethod2();
		
		System.out.println();
		
		
		Service.staticMethod1();
	    Service.staticMethod2();
		//인터페이스에서 바로 가져옴
	}

}
