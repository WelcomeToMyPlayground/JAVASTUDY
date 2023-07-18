package sec03.exam02;

import java.util.Scanner;

public class 나누기곱하기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력");
		int a = scan.nextInt();

		System.out.println("두 번째 숫자 입력");
		int b = scan.nextInt();
		

		System.out.println("연산기호 입력");
		String c = scan.next();
		char d = c.charAt(0);
		
		
		if (d == '*') {
			int e = a * b;
			System.out.println("입력하신 연산의 결과는 " + e +"입니다.");		
		}
		else {
			double f = (double) a/b;
			System.out.println("입력하신 연산의 결과는 " + f +"입니다.");
		}
		
		
		

	}

}
