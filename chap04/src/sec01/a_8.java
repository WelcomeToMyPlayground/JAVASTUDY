package sec01;

import java.util.Scanner;

public class a_8 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1; // 1���� 6����
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� (1~6)");
		int num2 = s.nextInt();

		System.out.println("��ǻ�� �� :" + num);
		System.out.println("����� �� :" + num2);

		if (num == num2) {
			System.out.println("�� ���� ��ġ�մϴ�.");
		} else if (num > num2) {
			System.out.println("��ǻ�� ���ڰ� �� Ů�ϴ�.");
		} else if (num < num2) {
			System.out.println("����� ���ڰ� �� Ů�ϴ�.");
		}
	}
}
