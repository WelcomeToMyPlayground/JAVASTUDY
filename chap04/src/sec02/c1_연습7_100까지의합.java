package sec02;

import java.util.Scanner;

public class c1_연습7_100까지의합 {

	public static void main(String[] args) {
		
		//사용자로부터 숫자를 입력받으세요 (1 ~ 100사이)
		// int 1부터 사용자가 입력한 숫자까지의 합계를 구하세요 (for문 활용)
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 (1 ~ 100사이)");
		
		int num1 = s.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num1; i++) {
			
			sum += i;
		}
		System.out.println("1부터 " + num1 + "까지의 합계는: " + sum + " 입니다.");
	}
}
