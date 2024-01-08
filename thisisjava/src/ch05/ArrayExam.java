package ch05;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] height = new int[5];
		height[0] = 170;
		height[1] = 172;
		height[2] = 174;
		height[3] = 176;
		height[4] = 178;
		
		
		//int[] height2 = new int [height.length];
		//for(int i =0;i<height.length;i++) {
		//	height2[i] = height[i];
		//}	
		
		//for(int i =0;i<height2.length;i++) {
			//System.out.println(height[i]);
			
		//}
	int[] height2= new int [5];
	System.arraycopy(height, 0, height2, 0, 5);
	//원 배열과 같은 사이즈의 빈 배열 생성 후 시스템.arraycopy 메서드 사용
	
	height2[0] = 190;
	
	for(int i=0;i<height.length;i++) {
		System.out.println((i+1) + "번째 학생의 키 :" + height[i]);
	}
		for(int i=0;i<height2.length;i++) {
			System.out.println((i+1) + "번째 학생의 키 :" + height2[i]);
		}
	
}
}
