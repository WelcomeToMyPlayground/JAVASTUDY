package sec02;

import java.util.Scanner;

public class 확인문제4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("학생 수 입력");
		int a = s.nextInt();
		System.out.println("연필 개수 입력");
		int b = s.nextInt();

		int c = b / a;
		int d = b % a;

		System.out.printf("학생 한 명당 %d개씩 연필을 가져가고 %d개가 남아요", c, d);
//		System.out.println("학생 한 명당 "+ c +"개씩 연필을 가져가고 "+ d +"개가 남아요");

	}
}