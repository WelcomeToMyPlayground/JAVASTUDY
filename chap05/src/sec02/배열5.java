package sec02;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 사용자가 입력한 숫자로 배열 개수 생성
		// for문을 이용하여 배열에 숫자를 1부터 사용자가 입력한 숫자만큼 데이터 추가
		// 입력된 데이터의 평균값을 출력
		
		System.out.print("배열 개수를 알려주세요: ");
		int arraynum = s.nextInt();
		int[] num1 = new int[arraynum];           // num1이라는 배열을 선언, arraynum개의 개수를 가짐 

		for (int i = 0; i < arraynum; i++) {
			num1[i] = i+1;                        // 배열에 데이터를 추가 (1부터 사용자가 입력한 숫자만큼)
		}
		int sum = 0;
		double avg = 0;
		
		for (int j=0; j< arraynum; j++) {
			sum += num1[j];                     // 배열에 들어있는 데이터들의 합을 계산
			avg = (double) sum/arraynum;        // 평균
		}
		System.out.println("평균: " + avg);
		System.out.println("합계: " + sum);
	}

}
