package sec01;

import java.util.Scanner;

public class 연산우선순위 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		int num1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int num2 = s.nextInt();
		
		// 삼항 연산자를 사용하여 두 수의 합이 50 이상이면 "통과"
		// 50 미만이면 "탈락"을 출력하시오 
		
		int sum = num1 + num2;
		String result = (sum >= 50) ? "통과" : "탈락" ;
		System.out.println(result);
		
	}

}

