package _02;

import java.util.Scanner;

public class �迭¦�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int a [] = new int[10];
		 
		 System.out.print("���� 10���� �Է��ϼ��� : ");
		 
		 for(int i=0; i<a.length; i++) {
			 a[i] = s.nextInt();
		 }
		 
		 System.out.print("¦���� : ");
		 for(int i=0; i<a.length; i++) {
			 if (a[i] % 2 == 0) {
				 System.out.print(a[i]+" ");
			 }
		 }

	}

}
