package _02;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("����� " + me.average());
		
	}

}
