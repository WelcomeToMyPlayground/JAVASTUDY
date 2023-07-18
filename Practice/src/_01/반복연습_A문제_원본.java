package _01;

import java.util.Scanner;

public class 반복연습_A문제_원본 {

	public static void main(String[] args) {

		// 컴퓨터랑 나랑 윷놀이 게임 (도,개,걸,윷,모)
		// 1 - 게임 시작 2- 게임 종료
		// 2 게임 종료가 나올 때까지 무한 반복
		// 1을 누르면 컴퓨터 랜덤으로 출력한 결과가 나오게끔 -> 예) 컴퓨터 : 걸
		// switch 이용
		// 1을 누르면 나의 랜덤으로 출력한 결과 -> 예) 나 : 윷
		// 당신이 이겼습니다. <- 출력

		Scanner s = new Scanner(System.in);

		boolean game = true;
		
		while (game) { // true가 들어갔으니 무한 반복
			System.out.println("윷놀이 게임을 시작합니다");
			System.out.println("1은 게임시작, 2는 게임종료");
			int choice = s.nextInt(); // 선택

			if (choice == 2) { // 게임 종료
				System.out.println("게임을 종료합니다.");
				game = false;
			} else { // 게임 시작
				int random = (int) (Math.random() * 5) + 1;     // 1에서 5사이 숫자를 랜덤으로 추첨
				System.out.println("숫자를 입력하세요(1~5 사이)");
				int a = s.nextInt(); 
				
				if(a==1) {
					System.out.println("나: 도");
				} else if(a==2) {
					System.out.println("나: 개");
				} else if(a==3) {
					System.out.println("나: 걸");
				} else if(a==4) {
					System.out.println("나: 윷");
				} else {
					System.out.println("나: 모");
				}

				switch (random) {
				case 1:
					System.out.println("컴퓨터: 도");
					break;
				case 2:
					System.out.println("컴퓨터: 개");
					break;
				case 3:
					System.out.println("컴퓨터: 걸");
					break;
				case 4:
					System.out.println("컴퓨터: 윷");
					break;
				default:
					System.out.println("컴퓨터: 모");

				}
				if (a > random) {
					System.out.println("당신이 이겼습니다");
					game = false;
				} else if (a==random) {
					System.out.println("비겼습니다");
					game = false;
				}
				else {
					System.out.println("당신이 졌습니다");
					game = false;
				}
			}
		}
	}

}
