package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
				
		System.out.println("�� ���ڸ� �Է��ϼ���");
		String a = s.next();
		
		char b = a.charAt(0); // ù ����  0
		// charAt(����)�� string Ÿ������ ���� ���ڿ��� char Ÿ������ �� ���ڸ� �ް� ���ִ� �Լ� 
		// ���ڿ����� �ش� ���� ��ġ�� �ش��ϴ� ���ڿ��� char Ÿ������ ��ȯ
		
		int c = b; //char ����  int�� ��ȯ�ϸ� �ش� �����ڵ� ���� ��µ�
		
		// toString(������) �����͸� String Ÿ������ ��ȯ
		
		System.out.println("�Է��Ͻ� '" + a +"'�� �����ڵ� ����" + c +"�Դϴ�.");
		
		
	}

}
