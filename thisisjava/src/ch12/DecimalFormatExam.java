package ch12;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DecimalFormatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number = 1234567.89;
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println(df.format(number));
		
		DecimalFormat df1 = new DecimalFormat("\u00A4");
		System.out.println(df1.format(number));
		
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd (E) a hh:mm:ss");
	Date date = new Date();
	System.out.println(sdf.format(date));
	
	}
	
}
