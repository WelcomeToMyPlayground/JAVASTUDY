package sec02;

import java.util.Scanner;

public class f1_����1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		// �α��� ����
		String id = "abc";
		int password = 1234;
		
		 while (true) {
			System.out.print("���̵� �Է��ϼ���: ");
			id = s.next();
			System.out.print("��й�ȣ�� �Է��ϼ���: ");
			password = s.nextInt();
			
			if (id.equals("abc") &&  password != 1234) {
				System.out.println("��й�ȣ�� �޶��");
			} else if (!id.equals("abc")) {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			} else {
				System.out.println("ȯ���մϴ�");
				break;
			}

		}
	}
}
