package sec02;

import java.util.Scanner;

public class d1_연습2_2 {

	public static void main(String[] args) {

		// 30이하의 다른 정수 2개를 입력
		// 두 수 사이의 총 합을 출력하는 프로그램을 작성

		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력1 : ");
		int num1 = s.nextInt();
		System.out.print("정수 입력2 : ");
		int num2 = s.nextInt();

		int i = 0;
		int sum = 0;

		if (num1 > num2) {
			for (i = num2; i <= num1; i++) {
				sum += i;
				System.out.print(i + " + ");
			}
			System.out.println(" = " + sum);
		} else if (num2 > num1) {
			for (i = num1; i <= num2; i++) {
				sum += i;
				System.out.print(i + "+");
			}
			System.out.println(" = " + sum);
		}
	}
}
