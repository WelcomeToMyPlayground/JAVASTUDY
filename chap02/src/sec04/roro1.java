package sec04;

import java.util.Scanner;

public class roro1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("�� �ݾ� �Է� : ");   // 25600
		 int money = s.nextInt();
		 
		 System.out.println("�ܵ� : " + money +"��");           // 25600
		 System.out.println("10000�� : " + money/10000 +"��");  // 2
		 money = money % 10000;									// 5600
		 System.out.println("5000�� : " + money /5000 +"��");   // 1
		 money = money % 5000; 									// 600
		 System.out.println("1000�� : " + money /1000 +"��");   // 0
		 money = money % 1000; 									// 600
		 System.out.println("500�� : " + money /500 +"��");     // 1
		 money = money % 500;                                   // 100
		 System.out.println("100�� : " + money /100 +"��");     // 1
		 
	

	}

}
