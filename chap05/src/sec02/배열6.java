package sec02;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] weather = new String[4];

		weather[0] = "봄";
		weather[1] = "여름";
		weather[2] = "가을";
		weather[3] = "겨울";

		// 제대로 입력하면 중지하게끔
		boolean run = true;

		while (run) {
			System.out.println("좋아하는 계절을 입력하세요");
			System.out.println("봄은 1, 여름은 2, 가을은 3, 겨울은 4");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println(weather[0]);
				run = false;
				break;
			case 2:
				System.out.println(weather[1]);
				run = false;
				break;
			case 3:
				System.out.println(weather[2]);
				run = false;
				break;
			case 4:
				System.out.println(weather[3]);
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");

			}

		}
	}
}
