package sec02;

import java.util.Scanner;

public class d1_����3_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("������ �ܼ��� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("������ " + a + "��");

		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));

		}
	}
}
