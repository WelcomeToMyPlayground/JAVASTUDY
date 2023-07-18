package sec02;

import java.util.Scanner;

public class a5_확인문제9번_129p {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫 번째 수 입력");
		String a = s.next(); // next() 사용
		double b = Double.parseDouble(a); // 문자열을 실수로 바꿈
		
		System.out.println("두 번째 수 입력");
		String c = s.next();
		double d = Double.parseDouble(c);   

		double e = b / d; // 첫 번째 수에 두 번째 수를 나눔

		if (d == 0 || d == 0.0) {
			System.out.println("결과: 무한대");     // d가 double이라서 d == 0.0만 입력해도 ㄱㅊ음. 어차피 0 입력해도 0.0으로 인식         
		} else {
			
			System.out.println("결과: " + e);
		}

	}
}
