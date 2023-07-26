package chap11.sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {

		// ����

		/*
		  ���� �̿��
		  
		  ����� �̸� �Է� ���� �̿�� �̿� �׸� �Է� ����: ĿƮ 8000��, �ĸ� 20000��, ���� 25000��, ���� 60000��
		  
		  ���� �湮 �ð��� �����̸� 30% ���� �湮 �ð��� �� 12��~��6�� 10% ���� �������� ���� ����
		  
		  ��) ȫ�浿 �ĸ�
		  
		  -> ȫ�浿���� ���� �ݾ��� 18000�� �Դϴ�.
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = s.next();
		System.out.println("�̿� �׸��� �Է��ϼ���");
		String menu = s.next();
		
		int cost = 0;
		
		switch(menu) {
		case "ĿƮ":
			cost = 8000;
			break;
		case "�ĸ�":
			cost = 20000;
			break;
		case "����":
			cost = 25000;
			break;
		case "����":
			cost = 65000;
			break;	
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);
		
		if(hour<12 && ampm==0) { // ���� (0)
			cost *= 0.7;
		} else if(hour<6 && ampm==1) {  // ���� (1)
			cost *= 0.9;
		}
		System.out.println(name+"���� ���� �ݾ��� "+cost+"�� �Դϴ�.");
	}

}
