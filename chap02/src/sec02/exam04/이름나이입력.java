package sec02.exam04;

import java.util.Scanner;

public class 이름나이입력 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("이름 입력");
		String name = s.next();
		System.out.println("나이 입력");
		int age = s.nextInt();

		if (age < 20) {
			System.out.println(name + "님은 청년입니다.");
		} else {
			System.out.println(name + "님은 장년입니다.");
		}

	}
}
