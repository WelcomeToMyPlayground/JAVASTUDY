package ����1024;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("c:/temp2/test3.txt");
		
		Scanner s = new Scanner(System.in);
		String [] names = new String[5];	// ���̰� 5�� ���ڿ� �迭 'names' ����
		
		for(int i=0; i < names.length; i++) {	// 5�� �ݺ�
			System.out.print("�̸��� �Է��ϼ���");
			names[i] = s.next();	// Scanner ��ü s�� ����Ͽ� ����ڷκ��� Ű����� �Է��� ���ڿ��� �а�, �� ���ڿ��� �迭 names�� i��° ��ҿ� ����
			writer.write(names[i]+"\n");
			// �Է¹��� �̸��� writer�� ����Ͽ� ���Ͽ� ����, �� �̸� ���̿� �� �ٲ� ����(\n)�� �߰��Ͽ� �� �̸��� ���ο� �ٿ� ������ ��
		}
		
		writer.flush(); // ���ۿ� �ִ� data�� ���Ͽ� ������ �����
		writer.close();	// ���� ��� ��Ʈ���� �ݴ� �޼��� . ���Ͽ� ���� ������ �����
	}
}
