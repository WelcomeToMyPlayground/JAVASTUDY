package sec02;

import java.util.Scanner;

public class 배열_확인문제3_퀴즈 {

	public static void main(String[] args) {

		// 사용자로부터 배열 개수를 입력받으세요
		// 배열 개수만큼 숫자를 입력 받아서 배열에 삽입하세요
		// 해당 배열에서 가장 작은 숫자를 출력하세요
		// (단, 숫자는 양수만 가능)

		Scanner s = new Scanner(System.in);
		System.out.print("배열 개수 입력");
		int[] arr = new int[s.nextInt()];
		int min = arr[0];

		System.out.print("배열 개수에 해당하는 숫자 입력: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

			for (int j = 0; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
				}
			}
			System.out.println("최소값 : " + min);
		}
	}
}
