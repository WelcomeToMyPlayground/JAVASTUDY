package sec03.exam07;

import java.util.Scanner;

public class ����0620����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ݾ��� �Է����ּ���.");
		int money = s.nextInt();
		
		System.out.println("��������: " + money / 50000 + "��");
		money = money % 50000;
		System.out.println("������: " + money / 10000 +"��");
		money = money % 10000;
		
		
	}

}
