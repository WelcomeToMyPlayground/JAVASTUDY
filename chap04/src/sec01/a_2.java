package sec01;

import java.util.Scanner;

public class a_2 {

	public static void main(String[] args) {
		
		// int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է¹�������
		// ���� num�� 3�� ������ "3�� ����Դϴ�." ��� ����ϴ� ���α׷��� ��������. (if�� ���)
		
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = s.nextInt();
		
		if (num % 3 == 0 && num != 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
	}

}
