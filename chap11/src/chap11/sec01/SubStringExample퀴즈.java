package chap11.sec01;

import java.util.Scanner;

public class SubStringExample���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸����� �Է����ּ���");
		String email = s.next();
		
		// ��) 12dk545@hanmail.net -> ���̵� �����غ�����
		int id = email.indexOf("@");
		System.out.println(email.substring(0,id));
		
		// ������ �����ϱ� 
		int start = email.indexOf("@"); // ����� ��ġ�� ã��
		int leng = email.length(); // ��ü ���� ����
		String domain = email.substring(start+1,leng);
		// ����̺��� ������ �ڸ���
		System.out.println(domain);
		
		
	}

}
