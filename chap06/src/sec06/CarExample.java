package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Car car = new Car();
		boolean run = true;

		while (run) {
			System.out.print("숫자를 입력하세요. (1은 색상 변경, 2는 속도 변경, 3은 중단) : ");
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
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
