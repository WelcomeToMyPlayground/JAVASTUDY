package sec02;

import java.util.Scanner;

public class 다차원배열1_퀴즈2_강사님정답 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 반복문 통해 3명의 이름을 입력받고 person 배열로 생성함
		String [] person = new String[3];
		
		for (int i = 0; i < person.length; i++) {    // 0,1,2
			System.out.print((i+1) +"번째 사람 이름을 입력하세요 : ");
			person[i] = s.next();      // 철수, 영희, 순희
		}
		
		//점수 입력받는 배열
		
		int[][] num = new int[3][2];                      // 3행 2열 배열 생성
		for (int i = 0; i < num.length; i++) {            // 3행 (0,1,2)
			int sum = 0;                                  // 사람이 바뀔 때마다 합계값을 초기화
			for (int j = 0; j < num[i].length; j++) {     // 2열 (0,1)
				
				if (j==0) {
					System.out.println(person[i] + "의 중간점수를 입력하세요");
				} else {
					System.out.println(person[i] + "의 기말점수를 입력하세요");
				}
		
				num[i][j] = s.nextInt();  // 각각 위치에 값 삽입
				sum +=num[i][j];          // 각 사람의 합계값 계산				
			}
			double avg = (double) sum/2; //한 사람의 평균값 계산 후 출력
			System.out.println(person[i]+ "의 평균점수는 " + avg + "입니다");
		}
	}
}
