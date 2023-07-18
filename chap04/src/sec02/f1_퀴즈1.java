package sec02;

import java.util.Scanner;

public class f1_퀴즈1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		// 로그인 문제
		String id = "abc";
		int password = 1234;
		
		 while (true) {
			System.out.print("아이디를 입력하세요: ");
			id = s.next();
			System.out.print("비밀번호를 입력하세요: ");
			password = s.nextInt();
			
			if (id.equals("abc") &&  password != 1234) {
				System.out.println("비밀번호가 달라요");
			} else if (!id.equals("abc")) {
				System.out.println("아이디가 존재하지 않습니다.");
			} else {
				System.out.println("환영합니다");
				break;
			}

		}
	}
}
