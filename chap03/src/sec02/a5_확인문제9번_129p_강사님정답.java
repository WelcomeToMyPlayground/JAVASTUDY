package sec02;

import java.util.Scanner;

public class a5_Ȯ�ι���9��_129p_��������� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("ù ��° ��: ");
		double num1 = Double.parseDouble(s.next()); 
		
		System.out.print("�� ��° ��: ");
		double num2 = Double.parseDouble(s.next());   

		System.out.println("------------------------");

		if (num2 != 0.0) {
			System.out.println("���: " + (num1/num2));  
		} else {
			System.out.println("���: ���Ѵ�");
		}

	}
}
