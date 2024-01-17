package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sm = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String str = sm.format(date);
		
		System.out.println(str);
	}

}
