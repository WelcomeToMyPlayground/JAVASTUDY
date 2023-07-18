package sec02;

import java.util.Scanner;

public class d1_while예제4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 랜덤으로 숫자 추출 (1~10)
		int comNum = (int) (Math.random() * 20) + 1;
		int userNum;

		// 스무고개를 작성하세요
		// 사용자 입력이 while 안에 들어가야함

		while (true) {
			System.out.println("숫자 하나를 입력하세요(1 ~ 20)");
			userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum > comNum) {
				System.out.println("사용자 숫자가 더 큽니다");
			} else {
				System.out.println("사용자 숫자가 더 작습니다");

			}
		}
	}
}
