package sec02;

import java.util.Scanner;

public class �¼������ϱ�_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ��) �л��� 33��, ���� 5�� 
		System.out.println("�л� �� �Է�");
		int student = s.nextInt();            // 33
		System.out.println("�� �ٿ� �� �� �ɳ���?");
		int seat = s.nextInt();            // 5
		            
		double line1 = (double) student / (double) seat;
		int line2 = student / seat;
		
		if (line1 - line2 >0) {
			line1++;
		}
		int resultline = (int) line1;
		int remainseat = resultline * seat - student;
		System.out.printf("�� %d���̰� ���� �¼����� %d�Դϴ�." , resultline, remainseat);
		
	}
}