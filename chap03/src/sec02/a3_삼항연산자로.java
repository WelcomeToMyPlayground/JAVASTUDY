package sec02;

import java.util.Scanner;

public class a3_���׿����ڷ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// ��) ���� 5, ������ - �Է������� ���տ����ڸ� �̿��Ͽ�
		// 100���� 5�� �� num1�� ����� ��� ��) num -=5;

		int num1 = 100;
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String b = s.next();

		int result = (b.equals("+") ? num1 += a : b.equals("-") ? num1 -= a : b.equals("*") ? num1 *= a : b.equals("/") ? num1 /= a : b.equals("%") ? num1 %= a : a);

		System.out.println("������� : " + result);
	}

}
