package sec02.exam04;

import java.util.Scanner;

public class �̸������Է� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�̸� �Է�");
		String name = s.next();
		System.out.println("���� �Է�");
		int age = s.nextInt();

		if (age < 20) {
			System.out.println(name + "���� û���Դϴ�.");
		} else {
			System.out.println(name + "���� ����Դϴ�.");
		}

	}
}
