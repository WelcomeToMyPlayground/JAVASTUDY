package sec01;

import java.util.Scanner;

public class a_7_2 {

	public static void main(String[] args) {
		
		// �߰����� �⸻��� ��������� 90�� �̻��̸� "A����"
		// �߰����� �⸻��� ��������� 80�� �̻��̸� "B����"
		// �������� "C����"�̵� ��� �� �����̶� 60 �̸��̸� "�����"
		
		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������?");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������?");
		int last = s.nextInt();

		int avg = (mid + last) / 2;
		System.out.println("��� : " + avg);

		if (mid < 60 || last < 60) {
			System.out.println("�����");
		} else if (avg >= 90) {
			System.out.println("A����");
		} else if (avg >= 80) {
			System.out.println("B����");
		} else {
			System.out.println("C����");
		}

	}
}
