package chap11.sec01;

import java.util.Scanner;

public class IndexOfExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�ּҸ� �Է��ϼ���");
		String address = s.next();

		if (address.indexOf("����") != -1 || address.indexOf("�ξ�") != -1 || address.indexOf("���") != -1
				|| address.indexOf("���") != -1) {
			System.out.println("�ϱ� ���ֹ��Դϴ�.");
		} else {
			System.out.println("�ϱ� ���ֹ��� �ƴմϴ�.");
		}

	}

}
