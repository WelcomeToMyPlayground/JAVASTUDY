package sec02;

import java.util.Scanner;

public class Ȯ�ι���4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�л� �� �Է�");
		int a = s.nextInt();
		System.out.println("���� ���� �Է�");
		int b = s.nextInt();

		int c = b / a;
		int d = b % a;

		System.out.printf("�л� �� ��� %d���� ������ �������� %d���� ���ƿ�", c, d);
//		System.out.println("�л� �� ��� "+ c +"���� ������ �������� "+ d +"���� ���ƿ�");

	}
}