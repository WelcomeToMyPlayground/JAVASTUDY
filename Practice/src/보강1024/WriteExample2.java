package ����1024;


import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample2{

	public static void main(String[] args) throws Exception{
		// ���� ��� ��Ʈ�� ����
		// 'FileWriter' Ŭ������ ���Ͽ� ���ڸ� ���� ���� ��Ʈ���� ����,
		// "c:/temp2/test2.txt" ��ο� ������ �����ϰų� ���� ��
		// �� ��Ʈ���� ���� 'wr'�� �Ҵ��
		Writer wr = new FileWriter("c:/temp2/test2.txt");
		
		char a = '��';
		char b = '��';
		char c = '��';
		
		String d = "�����̹ٺ�";
		
		// �Ʒ� ���� �������� ���� ��Ʈ���� ���� �κ�
		// wr.write() �޼��带 ����Ͽ� ���ڸ� ���Ͽ� ��
		wr.write(a);
		wr.write(b);
		wr.write(c);
		wr.write(d);
		
		wr.flush(); // ���ۿ� �����ִ� �����͸� ������ ���
		wr.close();	// ���� ��� ��Ʈ���� �ݴ� �޼��� (������ ������ ���Ͽ� ���� ���� ����)
	}

}
