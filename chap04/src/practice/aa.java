package practice;

import java.util.Scanner;

public class aa {

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
					char g = code.charAt(1); // 
					int n = Character.getNumericValue(g);

					switch (a) {
					case 'A':
						System.out.println("å " + n + "�� ����");
						sum += n;
						break;
					case 'B':
						System.out.println("å " + n + "�� �ݳ�");
						sum2 += n;
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
