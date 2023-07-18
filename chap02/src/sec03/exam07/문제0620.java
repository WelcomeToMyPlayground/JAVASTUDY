package sec03.exam07;

import java.util.Scanner;

public class 문제0620 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("돈의 액수 입력");
		int a = s.nextInt();  //53254
		int b = a / 50000;   // 5
		int c = a % 50000;   // 3254 출력
		int d = c / 1000;    // 3 
		int e = c % 1000;   // 254 출력
		int f = e / 100;   // 2
		int g = e % 100;   // 54
		int h = g / 50;    // 1
		int i = g % 50;	   // 4
		int j = i / 10;     //
		int k = i % 10;     //
		
 	System.out.println("오만원권 " + b +"장, 천원권 " + d + "장, 백원동전 "+ f +"개, 오십원 동전 " + h +"개, 십원동전 " +  j +"개");

	}

}