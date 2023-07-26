package chap11.sec02;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int  hour = now.get(Calendar.HOUR);
		System.out.println("현재 시각: " + hour);
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
	}

}
