package sec01;

import java.util.Scanner;

public class if����1_1 {

	public static void main(String[] args) {
		
		// int Ÿ���� ���� score�� �����ϰ� Ű����� ���� �Է� ��������. (if�� ���)
		// ���� score�� 50 �̻��̸� �հ�, 50 �̸��̸� ������Դϴ�. 
		
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		int score = s.nextInt();
		
		if (score >= 50) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("������� ������.");
		}
	}

}
