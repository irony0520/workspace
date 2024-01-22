package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharConvertExam {

	public static void main(String[] args) {
		
		
		try {
			//기본 바이트처리 스트림
			OutputStream os = new FileOutputStream("C:/Temp2/test3.txt");
			//기본 바이트 처리 스트림 => writer로 변환
			Writer writer  = new OutputStreamWriter(os, "UTF-8");
			
			writer.write("문자 변환 스트림을 사용합니다.");
			writer.flush();
			writer.close();
			
			//기본 바이트 입력 스트림
			InputStream is = new FileInputStream("C:/Temp2/test3.txt");
			//기본 바이트 입력 스트림 - > reader로 변환해주는 보조스트림
			Reader reader = new InputStreamReader(is,"UTF-8");
			
			
			//크기 100의 char배열 생성
			char[] data = new char[100];
			//reader.read(data) -> 한번에 배열 용량만큼 데이터를 읽어오고, 읽어온 데이터 수를 리턴
			int num = reader.read(data);
			reader.close();
			//new String(char[], offset, length) 
			String str = new String(data,0,num);
			
			System.out.println(str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
