package sec04;

import java.util.Scanner;

public class PrintScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("순번\t이름\t나이");
		System.out.printf("%-3d\t%s\t%3d", 1, name, age);		
		 
		// 순번 %d 왼쪽 맞춤 자리수 3자리 (-3)
		// 이름 %s
		// 나이 %d 오른쪽 맞춤 자리수 3자리 (3)
	}
}
