package sec02;

import java.util.Scanner;

public class d1_while����4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// �������� ���� ���� (1~10)
		int comNum = (int) (Math.random() * 20) + 1;
		int userNum;

		// �������� �ۼ��ϼ���
		// ����� �Է��� while �ȿ� ������

		while (true) {
			System.out.println("���� �ϳ��� �Է��ϼ���(1 ~ 20)");
			userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (userNum > comNum) {
				System.out.println("����� ���ڰ� �� Ů�ϴ�");
			} else {
				System.out.println("����� ���ڰ� �� �۽��ϴ�");

			}
		}
	}
}
