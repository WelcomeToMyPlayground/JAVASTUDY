package sec02;

import java.util.Scanner;

public class 다차원배열1_퀴즈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("이름을 입력하세요 : ");
		for (int i = 0; i < 3; i++) {    // 0,1,2
			String name = s.next();      // 철수, 영희, 순희
		}
		
		//점수 입력받는 배열
		
		int[][] num = new int[3][2]; // 3행 2열 배열 생성
		System.out.print("점수를 입력하세요 (중간, 기말): ");

		for (int j = 0; j < 3; j++) { // 3행 (0,1,2)
			
			for (int k = 0; k < 2; k++) { // 2열 (0,1)
				num[j][k] = s.nextInt();
			}
		}
		int sum1 = num[0][0] + num[0][1];
		int sum2 = num[1][0] + num[1][1];
		int sum3 = num[2][0] + num[2][1];
	
		double avg1 = (double) sum1/2; 
		double avg2 = (double) sum2/2; 
		double avg3 = (double) sum3/2; 
		
		System.out.println("철수의 평균 점수: " + avg1);
		System.out.println("영희의 평균 점수: " + avg2);
		System.out.println("순희의 평균 점수: " + avg3);
	}
}
