package sec02;

import java.util.Scanner;

public class c1_����5 {

	public static void main(String[] args) {
		
		//�н��ڵ带 �Է��ϼ���
		//�н��ڵ�� ��) 20M456 , 22K123, 23E447
		// �� 2�� ���ڴ� ��û�⵵
		// ����° ���ڴ� ������ ��Ÿ���ϴ�
		// M ����, K ����, E ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("�н��ڵ带 �Է��ϼ���");
		String code = s.next();
		
		String b = code.substring(0,2); // ��û�⵵ 
		char a = code.charAt(2); //����
		
		switch (a){
		case 'M':
		case 'm':
			System.out.println("20"+b+"�⵵ ���а��� ��û���Դϴ�");
			break;
		case 'K':
		case 'k':
			System.out.println("20"+b+"�⵵ ������� ��û���Դϴ�");
			break;
		default:
			System.out.println("20"+b+"�⵵ ������� ��û���Դϴ�");			
		}
		

	}

}
