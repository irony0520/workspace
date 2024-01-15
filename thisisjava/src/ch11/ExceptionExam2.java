package ch11;

public class ExceptionExam2 {
	
	public static void main(String[] args) {
		
		
		int [][] array = new int[4][];
		array[0] = new int[]{1,2,3,4,5};	 
		array[1] = new int[]{1,2,3,4,5,6,7,8,9,10};
		array[2] = null;
		array[3] = new int[51]; //던지고 던져져서 try{printCheck(arr);}까지 던져진 후 출력
		
		for(int[] arr : array) {//array 로 접근시 4개의 큰 배열에 접근
			
			try{printCheck(arr);} //printcheck로 이동
		catch(ArrayLengthOver e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("배열이 비어있습니다.");
		}
	 }
  }

	private static void printCheck(int[] array) throws ArrayLengthOver {
		boolean b = CheckArray(array);
		if(b) {
			System.out.println("배열의 크기가 10보다 크거나 같습니다."); //true
			
		}
		else {
			System.out.println("배열의 크기가 10보다 작습니다.");
		}
	}

	private static boolean CheckArray(int [] array) throws ArrayLengthOver,NullPointerException {
		//배열크기 >10 --> true를 반환. int[] array  //NullPointerException가 있으면 위로 튕겨나감(throws도 제한없음)
		
		if(array.length > 50) {
			throw new ArrayLengthOver("배열의 길이가 50을 초과했습니다."); //array 4의 경우 배열길이 51이라 던져짐
		}
		else {
			return false;
		}
		
	}

		
}
