package sec02;

import java.util.Scanner;

public class �迭4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��� �ּ���");
		int a = s.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��� �ּ���");
		int b = s.nextInt();
		
	// Ÿ��[] ���� = new Ÿ��[����];
		int [] c = new int[2];    // 2�� ������ ���� int �迭 ����
		c[0] = a;
		c[1] = b;
		// c = new int[] {a,b};    - �ѹ��� �ֱ�
		
		int sum = c[0] + c[1];
		System.out.println(sum);
		
		for(int i = 0; i < 2; i++) {
			sum += c[i];
		}
		System.out.println(sum);
		
	}

}
