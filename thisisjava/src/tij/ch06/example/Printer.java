package tij.ch06.example;

public class Printer {
	
	int a;
	boolean b;
	double c;
	String d;
	
	
	void println(int a) {
		System.out.println(a);
		
	}
	

	void println(boolean b) {
		System.out.println(b);
		
	}

	void println(double c) {
		System.out.println(c);
		
	}

	void println(String d) {
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		
		
	}

}
