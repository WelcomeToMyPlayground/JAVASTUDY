package sec02;

import java.util.Scanner;

public class a5_Ȯ�ι���9��_129p {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù ��° �� �Է�");
		String a = s.next(); // next() ���
		double b = Double.parseDouble(a); // ���ڿ��� �Ǽ��� �ٲ�
		
		System.out.println("�� ��° �� �Է�");
		String c = s.next();
		double d = Double.parseDouble(c);   

		double e = b / d; // ù ��° ���� �� ��° ���� ����

		if (d == 0 || d == 0.0) {
			System.out.println("���: ���Ѵ�");     // d�� double�̶� d == 0.0�� �Է��ص� ������. ������ 0 �Է��ص� 0.0���� �ν�         
		} else {
			
			System.out.println("���: " + e);
		}

	}
}
