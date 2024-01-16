package ch12;

public class MeasureTimeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		long ct = System.currentTimeMillis();
//		long nt = System.nanoTime();
//		
//		System.out.println(ct);
//		System.out.println(nt);
		
		long sum=0;
		
		long nt1 = System.nanoTime();
		
		for(int i= 0;i<1000000;i++) {
			sum += i; 
		}
		
		long nt2 = System.nanoTime();
		System.out.println(nt2-nt1);
	}

}
