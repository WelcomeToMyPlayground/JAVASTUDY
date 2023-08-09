package sec01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();

		// 1 ������ �߰�
		// ����ڷκ��� �����͸� �Է� �޾� �ڵ��� Ŭ������ ��ü�� �����Ͽ� ����Ʈ�� �߰��ϼ���

		// 2 ������ ����
		// 3 ����ڷκ��� �ε��� ��ȣ�� �Է¹޾� ����Ʈ �����͸� �����Ͽ�

		// 3 ������ ���
		// �Էµ� ����Ʈ �����͸� ��� ����ϼ���

		// 4 ����

		Scanner s = new Scanner(System.in);
		boolean start = true;

		while (start) {
			System.out.println("�۾� ������ �������ּ���");
			System.out.println("�߰��� 1��, ������ 2��, ����� 3��, ����� 4��");
			int choice = 0;

			try {
				choice = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			} 

			switch (choice) {
			case 1:
				System.out.println("���� ����ȸ���?");
				String company = s.next();
				System.out.println("���� ������?");
				int cost = s.nextInt();
				System.out.println("���� �ְ�ӵ���?");
				int maxSpeed = s.nextInt();
				System.out.println("���� ������?");
				String color = s.next();

				list.add(new Car(company, cost, maxSpeed, color));
				break;

			case 2:
				System.out.print("������ �������� �ε��� ��ȣ�� �Է��ϼ���: ");
				int num = s.nextInt();
				list.remove(num);
				break;

			case 3:
				for (int i = 0; i < list.size(); i++) {
					Car car2 = list.get(i);
					System.out.println(car2.company +" "+ car2.cost +" "+car2.maxSpeed+" "+car2.color);
				}
				break;
				
			case 4:
				start = false;
				break;
				
			default:
				break;
			}

		}

	}

}
