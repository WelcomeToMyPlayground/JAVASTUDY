package _01;

import java.util.Scanner;

public class A_Example {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		A a = new A();
		boolean game = true;

		while (game) { // true�� ������ ���� �ݺ�
			System.out.println("������ ������ �����մϴ�");
			System.out.println("1�� ���ӽ���, 2�� ��������");
			int choice = s.nextInt(); // ����

			if (choice == 2) { // ���� ����
				System.out.println("������ �����մϴ�.");
				game = false;
			} else { // ���� ����
				System.out.println("��ǻ��: " + a.play());		
				System.out.println("��: " + a.play());		
			}
		}
	}
}