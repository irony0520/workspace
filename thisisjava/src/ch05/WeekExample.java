package ch05;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Week today = null;
		Calendar cal = Calendar.getInstance(); //런 타임중 calendar객체는 한개만 존재한다
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
	
	switch(week) {
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5:
		System.out.println("Thursday");
		break;
	case 6:
		System.out.println("Friday");
		break;
	case 7:
		System.out.println("Saturday");
		break;
		
	}
	}
}
