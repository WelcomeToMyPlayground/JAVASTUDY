package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
				
		System.out.println("한 글자를 입력하세요");
		String a = s.next();
		
		char b = a.charAt(0); // 첫 글자  0
		// charAt(숫자)란 string 타입으로 받은 문자열을 char 타입으로 한 글자만 받게 해주는 함수 
		// 문자열에서 해당 숫자 위치에 해당하는 문자열을 char 타입으로 변환
		
		int c = b; //char 값을  int로 변환하면 해당 유니코드 값이 출력됨
		
		// toString(데이터) 데이터를 String 타입으로 변환
		
		System.out.println("입력하신 '" + a +"'의 유니코드 값은" + c +"입니다.");
		
		
	}

}
