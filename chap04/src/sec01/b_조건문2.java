package sec01;

import java.util.Scanner;

public class b_���ǹ�2 {

	public static void main(String[] args) {

		// ���� �ڵ�� A����1234, B���� 4567, C����9874
		// A �λ�� B ��ȹ�� C �ѹ���
		// ���ʽ� �ݾ� ���� 100����, ���� 70����, ���� 50����
		// ��) A����1234 -> �λ�� ����� ���ʽ��ݾ��� 1000000�� �Դϴ�.
		// switch���� 2��, charAt(),
		// ���ڿ� Ư�� �κ� ���� -> substring (1,3) ����, ����, ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է��� �ּ���");
		String code = s.next();

		char a = code.charAt(0); // �μ��ڵ�
		String b = code.substring(1, 3); // ���� ���ϱ�


		switch (a) {
		case 'A':
		case 'a':
			System.out.print("�λ�� " + b + "�� ");
			break;
		case 'B':
		case 'b':
			System.out.print("��ȹ�� " + b + "�� ");
			break;
		default:
			System.out.print("�ѹ��� " + b + "�� ");
		}

		switch (b) {
		case "����":
			System.out.println("���ʽ� �ݾ��� 100�����Դϴ�.");
			break;
		case "����":
			System.out.println("���ʽ� �ݾ��� 70�����Դϴ�.");
			break;
		default:
			System.out.println("���ʽ� �ݾ��� 50�����Դϴ�.");
		}
	}

}
