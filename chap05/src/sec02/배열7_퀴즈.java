package sec02;

import java.util.Scanner;

public class �迭7_���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�迭�� ������? ");

		int[] arr = new int[s.nextInt()]; // �迭�� ���� �Է�
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = s.nextInt();    // �迭�� �� ���� �Է�
			arr[i] = num ;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("�հ�: " + sum);
		
		double avg = (double) sum / arr.length;
		System.out.println("���: " + avg);
	}

}
