package test;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String name = s.next();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String number1 = s.next();
		System.out.print("3. ��ȭ��ȣ: ");
		String number2 = s.next();
		
		System.out.println("[�Է��� ����]");
		System.out.printf("%s�� �ֹι�ȣ�� %s�̰� ����ó�� %s�Դϴ�.", name, number1, number2);

	}

}
