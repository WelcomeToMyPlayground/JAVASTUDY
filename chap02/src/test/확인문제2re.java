package test;

import java.util.Scanner;

public class Ȯ�ι���2re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù ��° �� �Է�");
		int a = s.nextInt();
		System.out.println("�� ��° �� �Է�");
		int b = s.nextInt();
		int result;
		
		if (a > b) {
			result = a - b;
			System.out.println("���� ��� : " +  result);
		}
		else {
			result = a + b;
			System.out.println("���� ��� : " + result);
		}
	}

}
