package sec02;

import java.util.Scanner;

public class �迭_Ȯ�ι���3_���� {

	public static void main(String[] args) {

		// ����ڷκ��� �迭 ������ �Է¹�������
		// �迭 ������ŭ ���ڸ� �Է� �޾Ƽ� �迭�� �����ϼ���
		// �ش� �迭���� ���� ���� ���ڸ� ����ϼ���
		// (��, ���ڴ� ����� ����)

		Scanner s = new Scanner(System.in);
		System.out.print("�迭 ���� �Է�");
		int[] arr = new int[s.nextInt()];
		int min = arr[0];

		System.out.print("�迭 ������ �ش��ϴ� ���� �Է�: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

			for (int j = 0; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
				}
			}
			System.out.println("�ּҰ� : " + min);
		}
	}
}
