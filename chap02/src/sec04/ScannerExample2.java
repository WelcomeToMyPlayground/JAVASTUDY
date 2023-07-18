package sec04;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {													// while 시작
			System.out.println("도어락 비밀번호를 입력하세요");
			String a = scanner.nextLine();
			
			if(a.equals("1234")) {										// if
				System.out.println("환영합니다.");
				break;
			}															// if 끝					   
			System.out.println("비밀번호가 틀립니다.");
		}																// while 끝 
	}
}
