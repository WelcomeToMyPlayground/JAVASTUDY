package sec02;

import java.util.Scanner;

public class �迭����3 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		// ����ڿ��� 3���� �̸��� �Է¹޾� �迭�� �����ϼ���
		// String Ÿ���� 5��¥�� �迭�� ������ �����ϼ���
		// ù ��° �迭���� �� ��° �迭�� ���� �����ϼ���
		
		String [] name = new String[3];
		
		for(int i = 0; i < name.length; i++) {
			System.out.print((i+1) +"��° �̸��� �Է��ϼ���");
			name[i] = s.next();
		}
		
		// ��) �� ��° �迭�� ö��, ����, ����, null, null
		// �� ��° �迭�� null���� ������ ä�켼��
		
		String [] name2 = new String[5];
		System.arraycopy(name, 0, name2, 0, name.length);
		
		for(int i=0; i <5; i++) {
			if(i >= 3) {    
				name2[i] = "����";
			}
			System.out.println(name2[i]);
		}
		
		//		name2 [3] = "����" ;

	}

}
