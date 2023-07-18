package sec03.exam07;

import java.util.Scanner;

public class 문제0620수정1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력해주세요.");
		int money = s.nextInt();
		
		System.out.println("오만원권: " + money / 50000 + "개");
		money = money % 50000;
		System.out.println("만원권: " + money / 10000 +"개");
		money = money % 10000;
		
		
	}

}
