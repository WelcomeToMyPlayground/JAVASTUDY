package sec02;

import java.util.Scanner;

public class �������迭1_���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("�̸��� �Է��ϼ��� : ");
		for (int i = 0; i < 3; i++) {    // 0,1,2
			String name = s.next();      // ö��, ����, ����
		}
		
		//���� �Է¹޴� �迭
		
		int[][] num = new int[3][2]; // 3�� 2�� �迭 ����
		System.out.print("������ �Է��ϼ��� (�߰�, �⸻): ");

		for (int j = 0; j < 3; j++) { // 3�� (0,1,2)
			
			for (int k = 0; k < 2; k++) { // 2�� (0,1)
				num[j][k] = s.nextInt();
			}
		}
		int sum1 = num[0][0] + num[0][1];
		int sum2 = num[1][0] + num[1][1];
		int sum3 = num[2][0] + num[2][1];
	
		double avg1 = (double) sum1/2; 
		double avg2 = (double) sum2/2; 
		double avg3 = (double) sum3/2; 
		
		System.out.println("ö���� ��� ����: " + avg1);
		System.out.println("������ ��� ����: " + avg2);
		System.out.println("������ ��� ����: " + avg3);
	}
}
