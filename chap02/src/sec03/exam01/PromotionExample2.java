package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
				
		System.out.println("출신학교를 입력하세요");
		String a = s.next();
		char b = a.charAt(2);
	
		System.out.println("현재 몇학년 인가요?");
		int c = s.nextInt();
		
		if (b=='중') {
			System.out.println("당신은 중학교 " + c +"학년입니다.");
		}
		else {
			System.out.println("당신은 고등학교 " + c +"학년입니다.");
		}
		
	
	}

}
