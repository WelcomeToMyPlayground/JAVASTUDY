package sec02;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("x�� �ʱⰪ�� �Է��� �ּ���");
		int a = s.nextInt();
		System.out.println("y�� �ʱⰪ�� �Է��� �ּ���");
		int b = s.nextInt();
		System.out.println("���� ��ȣ�� �Է��� �ּ���(+,-)");
		String c = s.next();
		
		if (c.equals("+")) {
			System.out.println(++a);
		} else {
			System.out.println(--b);
		}
		
	}

}
