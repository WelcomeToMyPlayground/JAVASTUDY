package sec02;

import java.util.Scanner;

public class e1_161p7�� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�������࿡ �湮�Ͻ� ���� ȯ���մϴ�.");
		System.out.println("������ 1��, ����� 2��, �ܰ� Ȯ���� 3��, ����� 4���Դϴ�.");
		System.out.print("���� > ");
		int choice = s.nextInt();

		// �ܰ� balance, ���� deposit, ��� withdraw
		int balance = 50000; // ���� �ܰ� 0���� ����
		int deposit, withdraw;

		switch (choice) {
		case 1:
			System.out.println("�Ա� �ݾ��� ���Դϱ�?");
			deposit = s.nextInt();
			balance += deposit;
			System.out.println("�ԱݵǾ����ϴ�. ���� �ܾ��� : " + balance +" �� �Դϴ�.");
			break;
		case 2:
			System.out.println("��� �ݾ��� ���Դϱ�?");
			withdraw = s.nextInt();
			if (balance < withdraw) {
				System.out.println("���� �ܾ��� �����մϴ�.");
			} else {
				balance -= withdraw;
				System.out.println("��� �� �ܾ���: " + balance + " �� �Դϴ�");
			}
			break;
		case 3:
			System.out.println("������ ���� �ܾ��� : " + balance + " �� �Դϴ�.");
			break;
		default:
			System.out.println("�ȳ��� ���ʽÿ�.");

		}

	}

}
