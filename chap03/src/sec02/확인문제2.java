package sec02;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ٷνð� �Է�");
		int time = s.nextInt();
		int a = time * 9620;
		
		double result = (time >= 10) ? (a*1.2) : a ;
		System.out.println("�� �ӱ�: " + (int) result +"��");

	}

}
