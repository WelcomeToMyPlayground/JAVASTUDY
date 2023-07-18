package sec02;

import java.util.Scanner;

public class 좌석수구하기_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 예) 학생수 33명, 한줄 5명 
		System.out.println("학생 수 입력");
		int student = s.nextInt();            // 33
		System.out.println("한 줄에 몇 명씩 앉나요?");
		int seat = s.nextInt();            // 5
		            
		double line1 = (double) student / (double) seat;
		int line2 = student / seat;
		
		if (line1 - line2 >0) {
			line1++;
		}
		int resultline = (int) line1;
		int remainseat = resultline * seat - student;
		System.out.printf("총 %d줄이고 남은 좌석수는 %d입니다." , resultline, remainseat);
		
	}
}