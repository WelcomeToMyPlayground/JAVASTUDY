package sec02;

import java.util.Scanner;

public class c1_����7_100�������� {

	public static void main(String[] args) {
		
		//����ڷκ��� ���ڸ� �Է¹������� (1 ~ 100����)
		// int 1���� ����ڰ� �Է��� ���ڱ����� �հ踦 ���ϼ��� (for�� Ȱ��)
		
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� (1 ~ 100����)");
		
		int num1 = s.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num1; i++) {
			
			sum += i;
		}
		System.out.println("1���� " + num1 + "������ �հ��: " + sum + " �Դϴ�.");
	}
}
