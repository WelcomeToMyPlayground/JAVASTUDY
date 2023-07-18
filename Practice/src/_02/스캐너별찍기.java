package _02;

import java.util.Scanner;

public class 스캐너별찍기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = s.nextInt();
		
		for(int i=0; i<num; i++) {   // 입력한 수 = 행 0,1,2,3,4 => 5행
			for(int j=num; j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
