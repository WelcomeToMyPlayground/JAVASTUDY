package sec02;

import java.util.Scanner;

public class a5_확인문제9번_129p_삼항연산자로 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫 번째 수 입력");
		String a = s.next(); // next() 사용
		double b = Double.parseDouble(a); // 문자열을 실수로 바꿈
		
		System.out.println("두 번째 수 입력");
		String c = s.next();
		double d = Double.parseDouble(c);   

		double e = b / d; // 첫 번째 수에 두 번째 수를 나눔
		
		

	}
}
