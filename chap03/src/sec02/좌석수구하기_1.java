package sec02;

import java.util.Scanner;

public class 좌석수구하기_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 예) 학생수 33명, 한줄 5명 
		System.out.println("학생 수 입력");
		int a = s.nextInt();            // 33
		System.out.println("한 줄에 몇 명씩 앉나요?");
		int b = s.nextInt();            // 5
		            
		int c = a / b;
		int d = b - (a%b); 
			
		if (a%b == 0) {
			System.out.println("총"+ c +"줄이고 남은 좌석 수는 " + a%b +"입니다.");
		} 
		else if (d != 0) {
			System.out.println("총"+ (c+1) +"줄이고 남은 좌석 수는 " + d +"입니다.");
		
		}
		
	}
}