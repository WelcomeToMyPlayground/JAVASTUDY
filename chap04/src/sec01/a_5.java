package sec01;

import java.util.Scanner;

public class a_5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		int a = s.nextInt();
		System.out.print("����: ");
		int b = s.nextInt();
		System.out.print("����: ");
		int c = s.nextInt();
		int sum = a + b + c;

		// if ( a>6 && b>6 && c>6 && sum>=30)�� ����
		if (a <= 6 || b <= 6 || c <= 6 || sum < 30) {
			System.out.println("��� : ���հ��Դϴ�.");
		} else {
				System.out.println("��� : �հ��Դϴ�.");
		}
	}
}
