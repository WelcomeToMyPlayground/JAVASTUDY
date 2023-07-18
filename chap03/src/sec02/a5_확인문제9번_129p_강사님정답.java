package sec02;

import java.util.Scanner;

public class a5_확인문제9번_129p_강사님정답 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		double num1 = Double.parseDouble(s.next()); 
		
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(s.next());   

		System.out.println("------------------------");

		if (num2 != 0.0) {
			System.out.println("결과: " + (num1/num2));  
		} else {
			System.out.println("결과: 무한대");
		}

	}
}
