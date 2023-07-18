package sec02;

import java.util.Scanner;

public class 확인문제6 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 >");

			int selectNo = Integer.parseInt(s.nextLine());   // 선택
			
			
			if (selectNo == 1) {   
				// 입력받은 숫자만큼의 배열 생성
				System.out.print("학생수 >");
				studentNum = Integer.parseInt(s.nextLine());    // 학생수 입력
				scores = new int [studentNum];  
				
			} else if (selectNo == 2) {
				// 각 배열에 점수 입력
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(s.nextLine());
				}	
				
			} else if (selectNo == 3) {     
				// 각 배열의 점수 출력				
				for (int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				// 배열에서 최고 점수와 평균점수 출력
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {  // 최대값
						max = scores[i];
					}
					sum += scores[i]; // 합계
				}
				avg =(double) sum/studentNum;  // 평균
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
			} else if (selectNo == 5) {
				run = false; // 종료         
			}
		}
		System.out.println("프로그램 종료");
	}
}
