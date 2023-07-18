package sec02;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);


		// 예) 숫자 5, 연산자 - 입력했으면 복합연산자를 이용하여
		// 100에서 5를 뺀 num1의 결과를 출력 예) num -=5;

		int num1 = 100;
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("연산자를 입력하세요");
		String b = s.next();

		
		if (b.equals("+")) {
			num1 += a;
		}
		if (b.equals("-")) {
			num1 -= a;
		}
		if (b.equals("*")) {
			num1 *= a;
		}
		if (b.equals("/")) {
			num1 /= a;
		}
		if (b.equals("%")) {
			num1 %= a;
		}
		System.out.println("결과값은 : " + num1);
	}

}
