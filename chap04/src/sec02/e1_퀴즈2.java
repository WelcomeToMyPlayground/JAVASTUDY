package sec02;

import java.util.Scanner;

public class e1_����2 {

	public static void main(String[] args) {

		System.out.println("���� �ø������� �湮�� ȯ���մϴ�.");
		Scanner s = new Scanner(System.in);
		int sum = 0; // ����
		int sum2 = 0; // �ݳ�
		boolean run = true;

		while (run) {
			System.out.println("�۾��ڵ�� ������ �Է����ּ���.");
			String code = s.next(); // ��) A2, B3, CO

			char a = code.charAt(0); // A�� ����, B�� �ݳ�, C�� ����
			String b = code.substring(1); // ����
			int c = Integer.parseInt(b);

			switch (a) {
			case 'A':
				System.out.println("å " + c + "�� ����");
				sum += c;
				break;
			case 'B':
				System.out.println("å " + c + "�� �ݳ�");
				sum2 += c;
				break;
			default:
				System.out.println("����");
				run = false;

			}
		}

		System.out.println("�� ���� �Ǽ�: " + sum);
		System.out.println("�� �ݳ� �Ǽ�: " + sum2);
	}

}
