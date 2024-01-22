package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyExam {

	public static void main(String[] args) {
		
		//파일 인풋 스트림 -> 원본 사진     파일 아웃풋 스트림->복사 사진 저장 
		//  종료시각측정
		
		try {
			String originalPath = FileCopyExam.class.getResource("image.jpg").getPath(); //url(image).getPath --> Strin	
			FileInputStream fis = new FileInputStream(originalPath);
			FileOutputStream fos = new FileOutputStream("C:/Temp2/targetFile.jpg");
			long start = System.nanoTime();
			while(true) {
				int data = fis.read();
				if(data == -1) break;
				fos.write(data);
			}
			
			System.out.println("기본 파일 스트림: " + (System.nanoTime() - start));
			
//			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			start = System.nanoTime();
			while(true) {
				int data = fis.read();
				if(data == -1) break;
				bos.write(data);
							
			}
			System.out.println("버퍼 보조 스트림: " +(System.nanoTime() -start));
			fis.close();
			fos.flush();
			fos.close();
			bis.close();
			bos.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
