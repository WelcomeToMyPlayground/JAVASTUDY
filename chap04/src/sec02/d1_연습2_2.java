package sec02;

import java.util.Scanner;

public class d1_����2_2 {

	public static void main(String[] args) {

		// 30������ �ٸ� ���� 2���� �Է�
		// �� �� ������ �� ���� ����ϴ� ���α׷��� �ۼ�

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�1 : ");
		int num1 = s.nextInt();
		System.out.print("���� �Է�2 : ");
		int num2 = s.nextInt();

		int i = 0;
		int sum = 0;

		if (num1 > num2) {
			for (i = num2; i <= num1; i++) {
				sum += i;
				System.out.print(i + " + ");
			}
			System.out.println(" = " + sum);
		} else if (num2 > num1) {
			for (i = num1; i <= num2; i++) {
				sum += i;
				System.out.print(i + "+");
			}
			System.out.println(" = " + sum);
		}
	}
}
