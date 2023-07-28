package chap11.sec02;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar1 {

	public static void main(String[] args) {
		// �޷�
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int year = s.nextInt();
		System.out.println("���� �Է��ϼ���");
		int month = s.nextInt();

		Calendar start = Calendar.getInstance(); // start�� �ε��� ������ ��¥ ������ ������
		Calendar end = Calendar.getInstance();	 // end�� �ε��� ������ ��¥ ������ ������
		
		// get���� ������ ����Դٰ� set�� ���� ������ �����ϴ� ����
		
		start.set(year,  month - 1, 1);
		// ���� �� ����, month-1�� ����� ��Ȯ�� ���� �ν���, ��¥�� 1�Ϸ� ����
		end.set(year, month, 1);
		// ������ �� ����, �Է��� ���� ���� 1�Ϸ� �����ϰ�
		end.add(Calendar.DATE, -1);
		// ������ ��¥�� �Է��� �޿��� 1�� �� ��¥�� ����

		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		// ���� ��ȣ ���� -> �Ͽ��� 1 ����� 7

		System.out.println();
		System.out.println("=========[" + month + "��]==========");
		System.out.println(" �� �� ȭ �� �� �� �� ");

		for (int i = 1; i < dayweek; i++) {
			System.out.print("   "); // ���� ��ȣ�� �ش��ϴ� ��ŭ ���� �߰� (�� �ڸ��� 3ĭ)
		}

		for (int i = 1, j = dayweek; i <= end.get(Calendar.DATE); i++, j++) {
			// i�� ��¥�� ����ϱ� ���� ��, j�� ���� ��ȣ�� �Ǵ��ϱ� ���� ��
			System.out.printf("%3d", i);
			// ������ ���� 3�ڸ� ���缭 ��¥ ��� (2�ڸ��� ��¥, 1�ڸ��� ���� ����)
			
			if (j % 7 ==0) { // ���� ��ȣ�� 7.. ������̶�� �� �ٲ�)
				System.out.println();
			}
		}
	}
}
