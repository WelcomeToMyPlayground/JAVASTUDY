package sec02;

import java.util.Scanner;

public class c1_����10_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�1: ");
		int num1 = s.nextInt();
		System.out.print("���� �Է�2: ");
		int num2 = s.nextInt();
		
		int temp;
		if (num1>num2) {
		temp = num1;
		num1 = num2;
		num2 = temp;
		}

		for (int i = num1; i <= num2; i++) {
			
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
