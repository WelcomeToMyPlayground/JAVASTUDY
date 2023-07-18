package _01;

import java.util.Scanner;

public class A_Example {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		A a = new A();
		boolean game = true;

		while (game) { // true가 들어갔으니 무한 반복
			System.out.println("윷놀이 게임을 시작합니다");
			System.out.println("1은 게임시작, 2는 게임종료");
			int choice = s.nextInt(); // 선택

			if (choice == 2) { // 게임 종료
				System.out.println("게임을 종료합니다.");
				game = false;
			} else { // 게임 시작
				System.out.println("컴퓨터: " + a.play());		
				System.out.println("나: " + a.play());		
			}
		}
	}
}