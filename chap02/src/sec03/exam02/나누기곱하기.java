package sec03.exam02;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է�");
		int a = scan.nextInt();

		System.out.println("�� ��° ���� �Է�");
		int b = scan.nextInt();
		

		System.out.println("�����ȣ �Է�");
		String c = scan.next();
		char d = c.charAt(0);
		
		
		if (d == '*') {
			int e = a * b;
			System.out.println("�Է��Ͻ� ������ ����� " + e +"�Դϴ�.");		
		}
		else {
			double f = (double) a/b;
			System.out.println("�Է��Ͻ� ������ ����� " + f +"�Դϴ�.");
		}
		
		
		

	}

}
