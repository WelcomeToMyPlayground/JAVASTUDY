package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
				
		System.out.println("����б��� �Է��ϼ���");
		String a = s.next();
		char b = a.charAt(2);
	
		System.out.println("���� ���г� �ΰ���?");
		int c = s.nextInt();
		
		if (b=='��') {
			System.out.println("����� ���б� " + c +"�г��Դϴ�.");
		}
		else {
			System.out.println("����� ����б� " + c +"�г��Դϴ�.");
		}
		
	
	}

}
