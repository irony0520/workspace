package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] array = new String[]{"100","1oo"};
	
		
	try {

		for(int i=0;i<=array.length;i++) {
			System.out.println(i);
			System.out.println(array[i]);
			int value = Integer.parseInt(array[i]);
			}
		
		}
		catch (Exception e ) {
			System.out.println("정상적으로 처리할 수 없습니다.");
			
		}//모든 throwable에러 
	
		
	
	
	FileInputStream fis; 
	try {fis = new FileInputStream("abc.txt");
		 fis.close();
		}
	catch(FileNotFoundException e) {
		System.out.println("해당 파일을 찾을 수 없습니다.");
	}
	catch(IOException e) {
		System.out.println("IOExcepton");
	}
	finally {
		
	}
	
		
	
	
//		catch (NumberFormatException e) {
//			System.out.println("숫자가 아닌 것이 포함되어 있습니다.");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 인덱스를 초과했습니다.");
//		}
			
		}
	}


