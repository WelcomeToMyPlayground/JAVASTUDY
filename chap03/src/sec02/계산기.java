package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		// ���� 2�� �Է�
		// ������ �Է� ( +,-,*,/ )

		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է�");
		int a = s.nextInt();
		System.out.println("�� ��° ���� �Է�");
		int b = s.nextInt();
		System.out.println("�������Է�");
		String c = s.next();
		
		int temp;
	
		if (b > a) {
			temp = a ;
			a = b;
			b = temp;
		}
			
		if (c.equals("+")) {
			System.out.println("��: " + a + b);
		}
		if (c.equals("-")) {
			System.out.println("��: " + (a - b));
		}
		if (c.equals("*")) {
			System.out.println("��: " + a * b);
		}
		if (c.equals("/")) {
			System.out.println("��: " + (double) a / b);
		}

	}
}
