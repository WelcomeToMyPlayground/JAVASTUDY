package sec02;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("x의 초기값을 입력해 주세요");
		int a = s.nextInt();
		System.out.println("y의 초기값을 입력해 주세요");
		int b = s.nextInt();
		System.out.println("증감 기호를 입력해 주세요(+,-)");
		String c = s.next();

		if (c.equals("+")) {
			++a;
		} else {
			--b;
		}

		System.out.println("x값: " + a + ", y값: " + b);
	}

}
