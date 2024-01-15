package ch11;

public class ExceptionExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {

			int [] a = null;
			System.out.println(a.length);
						
		}catch(NullPointerException e) {
				
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.out.println("배열이 비어있습니다.");
		}catch(Exception e) {
			
		}
		finally {
			System.out.println("try-catch문이 종료됩니다.");
		}
	}

}
