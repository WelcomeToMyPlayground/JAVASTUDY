package test;

import java.util.Scanner;

public class 확인문제2re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력");
		int a = s.nextInt();
		System.out.println("두 번째 수 입력");
		int b = s.nextInt();
		int result;
		
		if (a > b) {
			result = a - b;
			System.out.println("뺄셈 결과 : " +  result);
		}
		else {
			result = a + b;
			System.out.println("덧셈 결과 : " + result);
		}
	}

}
