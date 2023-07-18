package sec02;

import java.util.Scanner;

public class d1_while예제3 {

	public static void main(String[] args) {

		// int 타입의 변수 num을 선언하고 키보드로 값을 입력받으세요
		// 1~ 변수 num 까지 합을 출력하는 프로그램을 작성해보세요 (while문 사용)
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = s.nextInt();
		
		int i = 1;
		int sum = 0;
			
		while (i <= num) {
			sum += i; 
			i++;			
		}
		System.out.println("1 ~ " + num +"의 합: " + sum);
	}

}
