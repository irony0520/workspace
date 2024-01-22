package ch18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Date;

public class Today {

	public static void main(String[] args) throws Exception {
		
		LocalDateTime ct = LocalDateTime.now();
		
		//System.out.println(ct.get());
		
		File dir = new File("C:/Temp2")
				;
		File file = new File("C:/Temp2/2024/01/22/now.txt");

		//Path path = Paths.get("C:", "Temp2","2024","01","22");
		
		//for(int i=0; i<10; i++) {
			if(!dir.exists()) {
				dir.mkdirs();
			//}
			
		}
		
		if(!file.exists()) {
			file.createNewFile();
		}

		
		FileOutputStream fos = new FileOutputStream("C:/Temp2/2024/01/22/now.txt");
		PrintStream ps = new PrintStream(fos);
		//LocalDateTime now = LocalDateTime.now();
		Date now = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 //String formatedNow = sdf.format(now);
		
		ps.print("현재 시각 :" + now);
		
	}

	
	
}
