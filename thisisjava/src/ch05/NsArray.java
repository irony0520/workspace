package ch05;

public class NsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] array = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
		
		int[][] height = new int[3][3]; //두번째 배열에 숫자입력시 사이즈 고정
		
		//1반 학생들의 키
		
		height[0][0] = 160;  //1반 1번
		height[0][1] = 165; 
		height[0][2] = 170;
		height[1][0] = 170;  
		height[1][1] = 170; 
		height[1][2] = 170;
		height[2][0] = 180; 
		height[2][1] = 180; 
		height[2][2] = 180;
	
		
	for(int j =0; j<height[0].length;j++) {
		System.out.printf("\n%d반 학생들의 키: ",j+1);
		
		for(int i = 0; i <height[0].length;i++) {
			System.out.printf("%d,",height[0][i] = height[j][i]);
			//if문으로 마지막 콤마 없애기
		}
	}
		 //2반 학생들
		
		
		
			
		} //3반 학생들
		
		
		
		
	

}

