package sec02;

import java.util.Scanner;

public class d1_while����3 {

	public static void main(String[] args) {

		// int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է¹�������
		// 1~ ���� num ���� ���� ����ϴ� ���α׷��� �ۼ��غ����� (while�� ���)
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = s.nextInt();
		
		int i = 1;
		int sum = 0;
			
		while (i <= num) {
			sum += i; 
			i++;			
		}
		System.out.println("1 ~ " + num +"�� ��: " + sum);
	}

}
