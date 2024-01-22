package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExam {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("C:/Temp2/test1.txt");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		byte[] arr = {40,50,60};
		
		
		
		os.write(a);
		os.write(b);
		os.write(c);
		os.write(arr);
		
		
		os.flush();
		os.close();
		
		
	}

}
