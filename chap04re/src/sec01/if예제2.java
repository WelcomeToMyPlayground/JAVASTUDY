package sec01;

import java.util.Scanner;

public class if����2 {

	public static void main(String[] args) {

			Scanner s  = new Scanner(System.in);
			
			System.out.println("���� �̸�?");
			String name = s.next();
			
			
			if (name.length()==3) {    // ���� �̸��� 3���ڸ� �� ��° ���� ���
				System.out.println(name.charAt(2));
				
			} else {    // �̸��� 2���ڸ� �� ��° ���� ���
				char b  = name.charAt(1);
				System.out.println(b);
			}
			
	}


}
