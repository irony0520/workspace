package ch05;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	String[] strArr = {"자바","파이썬","리액트","AWS"};

	
	for(int i =0;i <strArr ; i++) {
		System.out.println(i + "." + strArr[i]);
	}
	
	
	for(String item: strArr) {
		System.out.println(item);
	}
	
}


