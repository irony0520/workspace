package ch06.example;

public class Exercise6_23 {

	
	static int max(int[] arr) {
		if(arr == null|| arr.length == 0) {
			return -999999;
		}
		else {			
			int maxarr =arr[0];
			for(int i=0;i<arr.length;i++) {
				if(maxarr<arr[i]) {
					maxarr = arr[i];
				}			
			}
			return maxarr;
			//그냥 외우기
		}
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값:"+max(data));
	System.out.println("최대값:"+max(null));
	System.out.println("최대값:"+max(new int[]{})); //크기가 0인 배열
	}

}
