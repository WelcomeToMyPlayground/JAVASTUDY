package chap11.sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2���� �̸��� ó���ڵ带 �Է� ��������
		Scanner s = new Scanner(System.in);
		String names[] = new String[2];
		String codes[] = new String[2];
		
		int scores [] = new int[2];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			names[i] = s.next(); // �̸�
			System.out.println("ó���ڵ带 �Է��ϼ���");
			codes[i] = s.next(); // ó���ڵ�
			scores[i] = Integer.parseInt(codes[i].substring(1)); // ex) c88 �̸� 8���� ������ �߶� ���� -> ���������� ��ȯ �� �迭�� ����
			
			switch (codes[i].charAt(0)) {
			case 'A':
			case 'a':
				scores[i] *= 1.2 ;		
				break;
			case 'B':
			case 'b':
				scores[i] *= 1.1;			
				break;
			default:
				scores[i] *= 1.05;
			} 
		
			if(scores[i] >= 90) {
				System.out.println(names[i]+"���� �ֿ�� ����Դϴ�.");
			} else if (scores[i] >= 80) {
				System.out.println(names[i]+"���� ��� ����Դϴ�.");
			} else {
				System.out.println(names[i]+"���� �Ϲ� ����Դϴ�.");
			}
		}
	}
}
