package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Car car = new Car();
		boolean run = true;

		while (run) {
			System.out.print("���ڸ� �Է��ϼ���. (1�� ���� ����, 2�� �ӵ� ����, 3�� �ߴ�) : ");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				car.setColor();
				break;
			case 2:
				car.setSpeed();
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
