package sec02;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("근로시간 입력");
		int time = s.nextInt();
		int a = time * 9620;
		
		double result = (time >= 10) ? (a*1.2) : a ;
		System.out.println("총 임금: " + (int) result +"원");

	}

}
