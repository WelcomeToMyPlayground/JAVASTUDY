package sec03.exam07;

import java.util.Scanner;

public class ����0620 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �׼� �Է�");
		int a = s.nextInt();  //53254
		int b = a / 50000;   // 5
		int c = a % 50000;   // 3254 ���
		int d = c / 1000;    // 3 
		int e = c % 1000;   // 254 ���
		int f = e / 100;   // 2
		int g = e % 100;   // 54
		int h = g / 50;    // 1
		int i = g % 50;	   // 4
		int j = i / 10;     //
		int k = i % 10;     //
		
 	System.out.println("�������� " + b +"��, õ���� " + d + "��, ������� "+ f +"��, ���ʿ� ���� " + h +"��, �ʿ����� " +  j +"��");

	}

}