package sec02;

import java.util.Scanner;

public class �¼������ϱ�_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ��) �л��� 33��, ���� 5�� 
		System.out.println("�л� �� �Է�");
		int a = s.nextInt();            // 33
		System.out.println("�� �ٿ� �� �� �ɳ���?");
		int b = s.nextInt();            // 5
		            
		int c = a / b;
		int d = b - (a%b); 
			
		if (a%b == 0) {
			System.out.println("��"+ c +"���̰� ���� �¼� ���� " + a%b +"�Դϴ�.");
		} 
		else if (d != 0) {
			System.out.println("��"+ (c+1) +"���̰� ���� �¼� ���� " + d +"�Դϴ�.");
		
		}
		
	}
}