package sec02;

import java.util.Scanner;

public class a8_�����հ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ��� (1~20����)");
		int a = s.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ��� (1~20����)");
		int b = s.nextInt();
		int result = 0;

		// a�� 5 �Է�, b�� 8 �Է�
		while (true) {
			if (a <= b) {
				result += a; // result = result + a;
				a++;
			} else {
				break;
			}
			System.out.println("�� ���� ���� �հ�� :" + result);
		}
	}
}