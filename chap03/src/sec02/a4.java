package sec02;

import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
//		int score = 85;
//		char grade = (score>90) ? 'A':  ((score>80) ? 'B':'C');
//		System.out.println(score + "����" + grade + "����Դϴ�.");
//		
		// ����ڰ� ������ �Է��մϴ�.
		// ������ 90 �̻� "��"
		// 80�� �̻� "��"
		// ������ "��"
		
		Scanner s = new Scanner (System.in);
		System.out.println("������ �Է��ϼ���");
		int a = s.nextInt();
		
		char b = (a>=90) ? '��' : ((a>=80) ? '��' : '��');
		System.out.println("������ '" + b + "' �Դϴ�."); 
		
	}

}
