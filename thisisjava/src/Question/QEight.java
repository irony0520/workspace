package Question;

public class QEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[][] array = {
					{95, 86},
					{83,92,96},
					{78,83,93,87,88}
			};
			int sum = 0;
			double avg = 0.0;
			//int cnt(몇번 반복됐는가 - > 배열 몇개인지)
			for(int i =0;i<array.length;i++) {
				
				for(int j=0; j<array[i].length;j++) {
				sum += array[i][j];	
				avg += 1;
				
				}
				
				
				
				
			}
			System.out.println(sum);
			System.out.println(sum/avg);
			
	}

}   
//for(int[] arr : array) {
//for(int i : array){
//sum += i
//cnt++
//average = (double)sum/cnt;
//}


