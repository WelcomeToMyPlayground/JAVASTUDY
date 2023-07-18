package sec01;

import java.util.Scanner;

public class a_9_switch2 {

	public static void main(String[] args) {
		
		// 수험번호는 생일6자리와 영어대문자의 조합
		// 예) 030501B
		
		Scanner s = new Scanner(System.in);
		System.out.print("수험번호 입력: ");
		String num = s.next();
		
		switch (num.charAt(6)) {
		case 'A':
			System.out.println("시험장소가 201호입니다");
			break;
		case 'B':
			System.out.println("시험장소가 202호입니다");
			break;
		default:
			System.out.println("시험장소가 203호입니다");
		}
	}

}
