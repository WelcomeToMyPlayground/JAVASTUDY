package sec02;

import java.util.Scanner;

public class a7_���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// ������ �ڵ�� �ѱ� 3���ڿ� ���� 4���� �����Դϴ�.
		//ȫ�浿1234 -> ȫ�浿(���̵�) / 1234(���) ���� �и�
		
		System.out.println("������ �ڵ带 �Է��ϼ���");
		String code = s.next();
		
		String admin_id = code.substring(0,3); // ���� �ε������� �� �ε��� �ձ����� ����
		int admin_pass = Integer.parseInt(code.substring(3,7));
		
		System.out.print("���̵�: ");
		String name = s.next();
		
		System.out.print("�н�����: ");
		String pass = s.next();
		int password = Integer.parseInt(pass); // ���ڿ��� ���� pass�� int�� ��ȯ
		
		
		if (name.equals(admin_id)) {
			if (password == admin_pass) {
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
