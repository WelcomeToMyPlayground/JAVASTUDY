package sec02.exam04;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner (System.in);
		
		System.out.println("��ü �ǹ��� �� ���ΰ���?");	
		int a = s.nextInt(); 
		System.out.println("�� ���� �ο���?");
		int b = s.nextInt();
		
		System.out.println("�Է��Ͻ� �ǹ��� ��ü " + a*5 +"m�̰� �ִ� �����ο��� "+ b/3 +"���Դϴ�.");
		
		s.close();
		
	

	}

}
