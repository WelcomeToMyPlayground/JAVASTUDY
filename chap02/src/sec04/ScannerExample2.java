package sec04;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {													// while ����
			System.out.println("����� ��й�ȣ�� �Է��ϼ���");
			String a = scanner.nextLine();
			
			if(a.equals("1234")) {										// if
				System.out.println("ȯ���մϴ�.");
				break;
			}															// if ��					   
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		}																// while �� 
	}
}
