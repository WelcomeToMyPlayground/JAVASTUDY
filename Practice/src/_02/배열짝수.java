package _02;

import java.util.Scanner;

public class 배열짝수 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int a [] = new int[10];
		 
		 System.out.print("정수 10개를 입력하세요 : ");
		 
		 for(int i=0; i<a.length; i++) {
			 a[i] = s.nextInt();
		 }
		 
		 System.out.print("짝수는 : ");
		 for(int i=0; i<a.length; i++) {
			 if (a[i] % 2 == 0) {
				 System.out.print(a[i]+" ");
			 }
		 }

	}

}
