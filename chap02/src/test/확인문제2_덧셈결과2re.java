package test;

import java.util.Scanner;

public class Ȯ�ι���2_�������2re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("ù ��° �� : ");
		String strNum1 = s.next();
		System.out.print("�� ��° �� : ");
		String strNum2 = s.next();

		if (strNum1.equals(strNum2)) {
			System.out.println("�� ���� ���ƿ�");
		} else {
			System.out.println("�� ���� �޶��");
		}

	}

}
