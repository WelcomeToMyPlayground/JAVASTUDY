package sec01;

import java.util.Scanner;

public class a_9_switch2 {

	public static void main(String[] args) {
		
		// �����ȣ�� ����6�ڸ��� ����빮���� ����
		// ��) 030501B
		
		Scanner s = new Scanner(System.in);
		System.out.print("�����ȣ �Է�: ");
		String num = s.next();
		
		switch (num.charAt(6)) {
		case 'A':
			System.out.println("������Ұ� 201ȣ�Դϴ�");
			break;
		case 'B':
			System.out.println("������Ұ� 202ȣ�Դϴ�");
			break;
		default:
			System.out.println("������Ұ� 203ȣ�Դϴ�");
		}
	}

}
