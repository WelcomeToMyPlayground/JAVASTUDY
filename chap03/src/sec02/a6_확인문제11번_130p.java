package sec02;

import java.util.Scanner;

public class a6_Ȯ�ι���11��_130p {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���̵�: ");
		String name = s.nextLine();
		System.out.print("�н�����: ");
		String pass = s.nextLine();
		int password = Integer.parseInt(pass);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		} 
		else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}

	}

}
