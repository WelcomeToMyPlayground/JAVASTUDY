package _01;

import java.util.Scanner;

public class �ݺ�����_A����_���� {

	public static void main(String[] args) {

		// ��ǻ�Ͷ� ���� ������ ���� (��,��,��,��,��)
		// 1 - ���� ���� 2- ���� ����
		// 2 ���� ���ᰡ ���� ������ ���� �ݺ�
		// 1�� ������ ��ǻ�� �������� ����� ����� �����Բ� -> ��) ��ǻ�� : ��
		// switch �̿�
		// 1�� ������ ���� �������� ����� ��� -> ��) �� : ��
		// ����� �̰���ϴ�. <- ���

		Scanner s = new Scanner(System.in);

		boolean game = true;
		
		while (game) { // true�� ������ ���� �ݺ�
			System.out.println("������ ������ �����մϴ�");
			System.out.println("1�� ���ӽ���, 2�� ��������");
			int choice = s.nextInt(); // ����

			if (choice == 2) { // ���� ����
				System.out.println("������ �����մϴ�.");
				game = false;
			} else { // ���� ����
				int random = (int) (Math.random() * 5) + 1;     // 1���� 5���� ���ڸ� �������� ��÷
				System.out.println("���ڸ� �Է��ϼ���(1~5 ����)");
				int a = s.nextInt(); 
				
				if(a==1) {
					System.out.println("��: ��");
				} else if(a==2) {
					System.out.println("��: ��");
				} else if(a==3) {
					System.out.println("��: ��");
				} else if(a==4) {
					System.out.println("��: ��");
				} else {
					System.out.println("��: ��");
				}

				switch (random) {
				case 1:
					System.out.println("��ǻ��: ��");
					break;
				case 2:
					System.out.println("��ǻ��: ��");
					break;
				case 3:
					System.out.println("��ǻ��: ��");
					break;
				case 4:
					System.out.println("��ǻ��: ��");
					break;
				default:
					System.out.println("��ǻ��: ��");

				}
				if (a > random) {
					System.out.println("����� �̰���ϴ�");
					game = false;
				} else if (a==random) {
					System.out.println("�����ϴ�");
					game = false;
				}
				else {
					System.out.println("����� �����ϴ�");
					game = false;
				}
			}
		}
	}

}
