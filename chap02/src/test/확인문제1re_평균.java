package test;

import java.util.Scanner;

public class Ȯ�ι���1re_��� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� �̸���?");
		String name = s.next();
		System.out.print("�߰���� ����? ");
		double mid = s.nextDouble();
		System.out.print("�⸻��� ����? ");
		double last = s.nextDouble();
		System.out.print("����Ʈ ������? ");
		double report = s.nextDouble();
		
		double a = (mid+last+report) / 3;
		
		System.out.printf("%s���� ��� ������ : %5.2f �Դϴ�.", name, a );
		
		//�Ǽ����� ����� �� ���� ������ �ȿ� %.����f�� �ۼ��ϸ� �ش� ���ڱ����� �Ҽ��� �ڸ��� �����
		

	}
}
