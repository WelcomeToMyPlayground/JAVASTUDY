package sec01;

import java.util.Scanner;

public class b_���ǹ�1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �ڵ带 �Է��� �ּ���");
		//A115, B113, C119, a115, b113, c119
		String code = s.next();
		char a = code.charAt(0);
		
		switch (a) {
		case 'A':
		case 'a':
			System.out.println("�λ�ο� �����Ǽ̽��ϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�.");
			break;
		default:
			System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�");			
			
		}	
	}

}
