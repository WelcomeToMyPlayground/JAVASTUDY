package sec04;

import java.util.Scanner;

public class roro1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("총 금액 입력 : ");   // 25600
		 int money = s.nextInt();
		 
		 System.out.println("잔돈 : " + money +"원");           // 25600
		 System.out.println("10000원 : " + money/10000 +"장");  // 2
		 money = money % 10000;									// 5600
		 System.out.println("5000원 : " + money /5000 +"장");   // 1
		 money = money % 5000; 									// 600
		 System.out.println("1000원 : " + money /1000 +"장");   // 0
		 money = money % 1000; 									// 600
		 System.out.println("500원 : " + money /500 +"개");     // 1
		 money = money % 500;                                   // 100
		 System.out.println("100원 : " + money /100 +"개");     // 1
		 
	

	}

}
