package test;

import java.util.Scanner;

public class Ȯ�ι���1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� �̸���? ");
		String name = s.next();
		System.out.print("�����  ���̴�? ");
		int age = s.nextInt();
		System.out.print("����� �޴��� ��ȣ ��� 4�ڸ���? ");
		String number1 = s.next();
		System.out.print("����� �޴��� ��ȣ �� 4�ڸ���? ");
		String number2 = s.next();
		
		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age +"\n");
		System.out.printf("��ȭ : 010 - %s - %s", number1, number2 );

	}

}
