package sec01;

import java.util.Scanner;

public class a_1 {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);		
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		default:                                // ��� �ش��� �ȵǴ� ���
			System.out.println("��Ÿ");
			break;
			
		}

	}

}
