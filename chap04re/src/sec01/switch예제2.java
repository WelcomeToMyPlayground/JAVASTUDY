package sec01;

import java.util.Scanner;

public class switch����2 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		System.out.println("�а��ڵ带 �Է����ּ���");
		String code = s.next();
		
		//�а��ڵ�� A123, B123
		//�а��ڵ��� ù�ڸ��� A�̸� ���а�, B�̸� �濵�а�, C�̸� �����а�
		// ����ڰ� A123 -> ���а� �л��Դϴ�.
		
		char a = code.charAt(0);
		
		switch(a) {
		case 'A' :
			System.out.println("���а� �л��Դϴ�.");
			break;
		case 'B' :
			System.out.println("�濵�а� �л��Դϴ�.");
			break;
		default:
			System.out.println("�����а� �л��Դϴ�.");
			
		}

	}

}
