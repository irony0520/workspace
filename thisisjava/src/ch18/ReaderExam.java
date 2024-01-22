package ch18;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExam {

	public static void main(String[] args) {
		
		
		try {
			Reader reader = new FileReader("C:/Temp2/test2.txt");
			
			char[] arr = new char[100];
			
			
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				
				System.out.println((char)data);
			}
			reader.close();
			
			System.out.println();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
