package sec04;

import java.util.Scanner;

public class PrintScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = scan.next();
		System.out.println("���̸� �Է��ϼ���");
		int age = scan.nextInt();
		
		System.out.println("����\t�̸�\t����");
		System.out.printf("%-3d\t%s\t%3d", 1, name, age);		
		 
		// ���� %d ���� ���� �ڸ��� 3�ڸ� (-3)
		// �̸� %s
		// ���� %d ������ ���� �ڸ��� 3�ڸ� (3)
	}
}
