package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {

		// 숫자 2개 입력
		// 연산자 입력 ( +,-,*,/ )

		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력");
		int a = s.nextInt();
		System.out.println("두 번째 숫자 입력");
		int b = s.nextInt();
		System.out.println("연산자입력");
		String c = s.next();
		
		int temp;
	
		if (b > a) {
			temp = a ;
			a = b;
			b = temp;
		}
			
		if (c.equals("+")) {
			System.out.println("값: " + a + b);
		}
		if (c.equals("-")) {
			System.out.println("값: " + (a - b));
		}
		if (c.equals("*")) {
			System.out.println("값: " + a * b);
		}
		if (c.equals("/")) {
			System.out.println("값: " + (double) a / b);
		}

	}
}
