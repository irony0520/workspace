package ch12;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //일월화수목금토
//		System.out.println(Calendar.MONDAY);
//		System.out.println(Calendar.SUNDAY);
//		System.out.println(Calendar.YEAR); //상수
//		System.out.println(cal.get(Calendar.AM_PM));
//		System.out.println(cal.get(Calendar.HOUR));
//		System.out.println(cal.get(Calendar.MINUTE));
//		System.out.println(cal.get(Calendar.SECOND));
//	}

		System.out.println(cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH)+1 + "월 " + Calendar.DAY_OF_MONTH + "일 ");
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: System.out.print("일요일");
		break;
		case 2: System.out.print("월요일");
		break;
		case 3:	System.out.print("화요일");
		break;
		case 4:	System.out.print("수요일");
		break;
		case 5:	System.out.print("목요일");
		break;
		case 6:	System.out.print("금요일");
		break;
		case 7:	System.out.print("토요일");
		break;		
		}
		
		switch(cal.get(Calendar.AM_PM)) {
		case 0: System.out.print(" 오전 ");
		break;
		case 1: System.out.print(" 오후 ");
		break;
		}
		
					
		System.out.println(cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");
	}
	
}
