package sec02;

import java.util.Scanner;

public class �������迭1_����2_��������� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// �ݺ��� ���� 3���� �̸��� �Է¹ް� person �迭�� ������
		String [] person = new String[3];
		
		for (int i = 0; i < person.length; i++) {    // 0,1,2
			System.out.print((i+1) +"��° ��� �̸��� �Է��ϼ��� : ");
			person[i] = s.next();      // ö��, ����, ����
		}
		
		//���� �Է¹޴� �迭
		
		int[][] num = new int[3][2];                      // 3�� 2�� �迭 ����
		for (int i = 0; i < num.length; i++) {            // 3�� (0,1,2)
			int sum = 0;                                  // ����� �ٲ� ������ �հ谪�� �ʱ�ȭ
			for (int j = 0; j < num[i].length; j++) {     // 2�� (0,1)
				
				if (j==0) {
					System.out.println(person[i] + "�� �߰������� �Է��ϼ���");
				} else {
					System.out.println(person[i] + "�� �⸻������ �Է��ϼ���");
				}
		
				num[i][j] = s.nextInt();  // ���� ��ġ�� �� ����
				sum +=num[i][j];          // �� ����� �հ谪 ���				
			}
			double avg = (double) sum/2; //�� ����� ��հ� ��� �� ���
			System.out.println(person[i]+ "�� ��������� " + avg + "�Դϴ�");
		}
	}
}
