package test;

import java.util.Scanner;

public class Ȯ�ι���2_������� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		String strNum1 = s.next();
		System.out.print("�� ��° �� : ");
		String strNum2 = s.next();
		
		int num1= Integer.parseInt(strNum1);
		int num2= Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		
		System.out.println("���� ��� : " + result);
		
		
		
	}

}
