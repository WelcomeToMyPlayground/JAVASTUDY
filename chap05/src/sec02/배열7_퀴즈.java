package sec02;

import java.util.Scanner;

public class 배열7_퀴즈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("배열의 개수는? ");

		int[] arr = new int[s.nextInt()]; // 배열의 개수 입력
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = s.nextInt();    // 배열에 들어갈 숫자 입력
			arr[i] = num ;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("합계: " + sum);
		
		double avg = (double) sum / arr.length;
		System.out.println("평균: " + avg);
	}

}
