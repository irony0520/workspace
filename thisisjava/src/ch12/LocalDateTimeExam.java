package ch12;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyy.MM.dd a HH:mm:ss");
		String date = ldt.format(sdf);
		System.out.println(date);
		
		LocalDateTime my = ldt.minusYears(1);
		System.out.println(my.format(sdf));

	

		LocalDateTime mM = ldt.minusMonths(1);
		System.out.println(mM.format(sdf));
		
		
		if(my.isAfter(mM)) {
			System.out.println("mM의 날짜가 더 이후입니다.");
			
		}else {
			System.out.println("mM의 날짜가 같거나 이전입니다.");
		}
		
		
		if(my.isBefore(mM)) {
			System.out.println("mM의 날짜가 같거나 이전입니다.");
			
		}else {
			System.out.println("mM의 날짜가 더 이후입니다."); 
		}
		
		LocalDateTime ldt2 = LocalDateTime.now();
		System.out.println(ldt);
		
		
		if(ldt.isEqual(ldt2)) {
			System.out.println("두 날짜가 서로 같습니다");
		}else {
			System.out.println("두 날짜가 서로 다릅니다");
		}
		
		LocalDateTime nextYear = LocalDateTime.of(2025, 1,1,0,0,0);
		
		long dDay = ldt.until(nextYear, ChronoUnit.DAYS);  //ChronoUnit.Months........ Hours....
		
		System.out.println("남은 일 수: " + dDay);
		
	}

}
