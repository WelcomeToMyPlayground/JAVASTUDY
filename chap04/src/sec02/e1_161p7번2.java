package sec02;

import java.util.Scanner;

public class e1_161p7번2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("광주은행에 방문하신 것을 환영합니다.");

		// 잔고 balance, 예금 deposit, 출금 withdraw
		int balance = 50000;     // 통장 잔고 설정
		int deposit, withdraw;
		boolean run = true;

		while (run) {

			System.out.println("예금은 1번, 출금은 2번, 잔고 확인은 3번, 종료는 4번입니다.");
			System.out.print("선택 > ");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("입금 금액이 얼마입니까?");
				deposit = s.nextInt();
				balance += deposit;
				System.out.println("입금되었습니다. 현재 잔액은 : " + balance + " 원 입니다.");
				break;
			case 2:
				System.out.println("출금 금액이 얼마입니까?");
				withdraw = s.nextInt();
				if (balance < withdraw) {
					System.out.println("고객님 잔액이 부족합니다.");
				} else {
					balance -= withdraw;
					System.out.println("출금 후 잔액은: " + balance + " 원 입니다");
				}
				break;
			case 3:
				System.out.println("고객님의 통장 잔액은 : " + balance + " 원 입니다.");
				break;
			default:
				System.out.println("안녕히 가십시오.");
				run = false;
			}
		}
	}

}
