package Question;

public class QSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,5,3,8,2};
		int max = 0;

		
		// int max = array[0]
//		for(int i : array) {
			
//		for(int i = 0; i <array.length;i++) {
//			if(max < array[i]) {
//
//				max = array[i];
//				
//			}
//			 
		
		for(int i : array) { // array의 개수만큼 반복
			
			if(max < i) {//array[i]?
				
			max = i; 
			}
		}	
		System.out.println(max);
	}
}

