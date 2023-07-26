package chap11.sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {

		// 문제

		/*
		  전대 미용실
		  
		  사용자 이름 입력 받음 미용실 이용 항목 입력 받음: 커트 8000원, 파마 20000원, 염색 25000원, 매직 60000원
		  
		  만약 방문 시간이 오전이면 30% 할인 방문 시간이 낮 12시~밤6시 10% 할인 나머지는 할인 없음
		  
		  예) 홍길동 파마
		  
		  -> 홍길동님의 결제 금액은 18000원 입니다.
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = s.next();
		System.out.println("이용 항목을 입력하세요");
		String menu = s.next();
		
		int cost = 0;
		
		switch(menu) {
		case "커트":
			cost = 8000;
			break;
		case "파마":
			cost = 20000;
			break;
		case "염색":
			cost = 25000;
			break;
		case "매직":
			cost = 65000;
			break;	
		default:
			System.out.println("잘못 입력하셨습니다");
		}
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);
		
		if(hour<12 && ampm==0) { // 오전 (0)
			cost *= 0.7;
		} else if(hour<6 && ampm==1) {  // 오후 (1)
			cost *= 0.9;
		}
		System.out.println(name+"님의 결제 금액은 "+cost+"원 입니다.");
	}

}
