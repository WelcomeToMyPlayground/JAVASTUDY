package sec02;

import java.util.Scanner;

public class a6_확인문제11번_130p {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("아이디: ");
		String name = s.nextLine();
		System.out.print("패스워드: ");
		String pass = s.nextLine();
		int password = Integer.parseInt(pass);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} 
		else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}

	}

}
