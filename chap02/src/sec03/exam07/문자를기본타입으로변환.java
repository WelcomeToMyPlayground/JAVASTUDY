package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력");
		String a = s.next();
		int c = Integer.parseInt(a);
		
		System.out.println("두 번째 숫자 입력");
		String b = s.next();
		int d = Integer.parseInt(b);
		
		int sum = c + d;
		
		System.out.println("두 수의 합은 " + sum +"입니다.");
	
		System.out.println("문자 입력");
		String v = s.next();
		int g =Integer.parseInt(v);
		
		
		
		

	}

}
