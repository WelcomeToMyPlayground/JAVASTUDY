package test;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = s.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		String number1 = s.next();
		System.out.print("3. 전화번호: ");
		String number2 = s.next();
		
		System.out.println("[입력한 내용]");
		System.out.printf("%s님 주민번호는 %s이고 연락처는 %s입니다.", name, number1, number2);

	}

}
