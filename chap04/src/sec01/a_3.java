package sec01;

import java.util.Scanner;

public class a_3 {

	public static void main(String[] args) {
		
		// int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է¹�������
		// ���� num�� 2�� ����̸鼭 5�� ������ "2�� 5�� ����Դϴ�." ��� ����ϴ� ���α׷��� ��������. (if�� ���)
		
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = s.nextInt();
		
		if (num % 2 == 0 && num % 5 == 0 && num != 0) {
			System.out.println("2�� 5�� ����Դϴ�.");
		} else {
			System.out.println("2�� 5�� ����� �ƴմϴ�.");
		}
		s.close();
	}

}
