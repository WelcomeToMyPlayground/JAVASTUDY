package sec01.practice;

import java.util.Calendar;

public class 자바맨의일상 {

	public static void main(String[] args) {

		System.out.println("자바맨의 일상");

		Calendar now = Calendar.getInstance(); // 캘린더 생성
		int year = now.get(Calendar.YEAR); // 연도
		int month = now.get(Calendar.MONTH) + 1; // 달
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		int dayNext = day + 1;
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다");

		Runnable wake = new WakeUp();
		Thread t1 = new Thread(wake);
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println("공부합니다");
				} catch (Exception e) {
				}
			}
		});
		t2.start();

		Thread t3 = new Sleep();
		t3.start();
		
		try {
			Thread.sleep(4000);
		} catch(Exception e) {}
		System.out.println("오늘은 " + year + "년 " + month + "월 " + dayNext + "일 입니다");
		
		Thread t4 = new Thread(wake);
		t4.start();
		
		Thread t5 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println("공부합니다");
				} catch (Exception e) {
				}
			}
		});
		t5.start();
		
		Thread t6 = new Sleep();
		t6.start();
	}
}