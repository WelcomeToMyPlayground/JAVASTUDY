package sec01;

import java.util.Scanner;

public class a_4 {

	public static void main(String[] args) {
		
		// int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է¹�������
		// num�� Ȧ������ ¦������ �Ǻ��ϼ��� (if - else�� ���)
		
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num +"��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num +"��(��) Ȧ���Դϴ�.");
		}
		
	}

}
