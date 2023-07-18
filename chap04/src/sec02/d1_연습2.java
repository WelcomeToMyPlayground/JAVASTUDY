package sec02;

import java.util.Scanner;

public class d1_연습2 {

	public static void main(String[] args) {

		// 30이하의 다른 정수 2개를 입력
		// 두 수 사이의 총 합을 출력하는 프로그램을 작성

		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력1 : ");
		int num1 = s.nextInt();
		System.out.print("정수 입력2 : ");
		int num2 = s.nextInt();

		int large = 0;
		int small = 0;

		if (num1 > num2) {
			large = num1;
			small = num2;
		} else {
			large = num2;
			small = num1;
		}

		int sum = 0;

		for (int i = small; i <= large; i++) {
			sum += i;

			if (i == large) {
				System.out.print(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}

		}
	}
}
