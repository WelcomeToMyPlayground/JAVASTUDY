package sec01;

import java.util.Scanner;

public class switch예제2 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		System.out.println("학과코드를 입력해주세요");
		String code = s.next();
		
		//학과코드는 A123, B123
		//학과코드의 첫자리가 A이면 법학과, B이면 경영학과, C이면 국문학과
		// 사용자가 A123 -> 법학과 학생입니다.
		
		char a = code.charAt(0);
		
		switch(a) {
		case 'A' :
			System.out.println("법학과 학생입니다.");
			break;
		case 'B' :
			System.out.println("경영학과 학생입니다.");
			break;
		default:
			System.out.println("국문학과 학생입니다.");
			
		}

	}

}
