package sec02;

import java.util.Scanner;

public class �������迭1_����2_���������2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// �ݺ��� ���� 3���� �̸��� �Է¹ް� person �迭�� ������
		String[] person = new String[3];

		for (int i = 0; i < person.length; i++) { // 0,1,2
			System.out.print((i + 1) + "��° ��� �̸��� �Է��ϼ��� : ");
			person[i] = s.next(); // ö��, ����, ����
		}

		// ���� �Է¹޴� �迭

		int[][] num = new int[3][2]; // 3�� 2�� �迭 ����
		double[] result = new double[3]; // ��հ��� �����ϱ� ���� �迭 ����

		for (int i = 0; i < num.length; i++) { // 3�� (0,1,2)
			int sum = 0; // ����� �ٲ� ������ �հ谪�� �ʱ�ȭ
			for (int j = 0; j < num[i].length; j++) { // 2�� (0,1)

				if (j == 0) {  // ù ��° �Է°��̸� �߰����, �ι�°�� �⸻���
					System.out.println(person[i] + "�� �߰������� �Է��ϼ���");
				} else {
					System.out.println(person[i] + "�� �⸻������ �Է��ϼ���");
				}

				num[i][j] = s.nextInt(); // ���� ��ġ�� �� ����
				sum += num[i][j]; // �� ����� �հ谪 ���
			}
			result[i] = (double) sum / 2; // ������ ��հ� ���� �� result �迭�� ����

		}
		// 3���� ��հ� ���
		for (int i = 0; i < 3; i++) {
			System.out.println(person[i] + "�� ���������" + result[i] + "�Դϴ�.");

		}
	}
}
