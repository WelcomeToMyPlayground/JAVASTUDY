package _02;

import java.util.Scanner;

public class ��ĳ�ʺ���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է�");
		int num = s.nextInt();
		
		for(int i=0; i<num; i++) {   // �Է��� �� = �� 0,1,2,3,4 => 5��
			for(int j=num; j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
