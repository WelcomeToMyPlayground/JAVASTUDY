package sec01;

import java.util.Scanner;

public class a_6���� {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("��ǰ ����:");
		int a = s.nextInt();
		
		
		
		if (a >= 8) {
			System.out.println("������ " + (int) (a*7000*0.9) +"�Դϴ�.");
		} else
			System.out.println("������ " + (a*7000) + "�Դϴ�.");
	}

}
