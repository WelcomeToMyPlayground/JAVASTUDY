package chap09.sec01;

import chap09.sec01.Car.OldCar;

// Car Ŭ����
public class Car {

	// �ʵ�
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	String color; // ����

	// ������1
	Car() {
		// �⺻ ������
	}

	// ������2
	Car(String company, int cost) { // �Ű����� 2�� ������
		this.company = company;
		this.cost = cost;
	}

	// �޼ҵ�1
	void speedUp(int speed) { // �Ű����� 1��, void�� �������� �ʴ� �޼ҵ�
		this.speed += speed;
	}

	void OldSpeed() {
		// Car Ŭ���� ���ο����� OldCar ��ü �ٷ� ���� ������
		OldCar old = new OldCar();
		old.speed = 50;
	}

// OldCar Ŭ����
	class OldCar {
		// �ʵ�
		int speed; // �ӵ�
		int cost; // ����

		// �޼ҵ� (�Ű����� 1��, void�� ���ϰ� X)
		void speedUp(int speed) {
			this.speed += speed;
		}
	}
}

	class Car2 {

		Car car = new Car("����",300000);
		Car.OldCar oldcar = car.new OldCar();
		
		// car.speedUp(50);  // �� ���� �߻� ? 

}
