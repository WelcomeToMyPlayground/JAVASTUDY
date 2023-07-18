package sec02;

import java.util.Scanner;

public class c1_연습5 {

	public static void main(String[] args) {
		
		//학습코드를 입력하세요
		//학습코드는 예) 20M456 , 22K123, 23E447
		// 앞 2개 숫자는 신청년도
		// 세번째 문자는 과목을 나타냅니다
		// M 수학, K 국어, E 영어
		
		Scanner s = new Scanner(System.in);
		System.out.println("학습코드를 입력하세요");
		String code = s.next();
		
		String b = code.substring(0,2); // 신청년도 
		char a = code.charAt(2); //과목
		
		switch (a){
		case 'M':
		case 'm':
			System.out.println("20"+b+"년도 수학과목 신청자입니다");
			break;
		case 'K':
		case 'k':
			System.out.println("20"+b+"년도 국어과목 신청자입니다");
			break;
		default:
			System.out.println("20"+b+"년도 영어과목 신청자입니다");			
		}
		

	}

}
