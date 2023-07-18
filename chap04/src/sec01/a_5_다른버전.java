package sec01;

import java.util.Scanner;

public class a_5_다른버전 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("국어: ");
		int a = s.nextInt();
		System.out.print("수학: ");
		int b = s.nextInt();
		System.out.print("영어: ");
		int c = s.nextInt();
		int sum = a + b + c;

		if (a <= 6 || b <= 6 || c <= 6) {
			System.out.println("결과 : 불합격입니다.");
		} else if (sum >= 30){
			System.out.println("결과 : 합격입니다.");
		} else {
			System.out.println("결과 : 불합격입니다.");
		}
		
	}
}
