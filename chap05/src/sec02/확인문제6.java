package sec02;

import java.util.Scanner;

public class Ȯ�ι���6 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("���� >");

			int selectNo = Integer.parseInt(s.nextLine());   // ����
			
			
			if (selectNo == 1) {   
				// �Է¹��� ���ڸ�ŭ�� �迭 ����
				System.out.print("�л��� >");
				studentNum = Integer.parseInt(s.nextLine());    // �л��� �Է�
				scores = new int [studentNum];  
				
			} else if (selectNo == 2) {
				// �� �迭�� ���� �Է�
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(s.nextLine());
				}	
				
			} else if (selectNo == 3) {     
				// �� �迭�� ���� ���				
				for (int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				// �迭���� �ְ� ������ ������� ���
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {  // �ִ밪
						max = scores[i];
					}
					sum += scores[i]; // �հ�
				}
				avg =(double) sum/studentNum;  // ���
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
				
			} else if (selectNo == 5) {
				run = false; // ����         
			}
		}
		System.out.println("���α׷� ����");
	}
}
