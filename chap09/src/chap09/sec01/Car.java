package chap09.sec01;

import chap09.sec01.Car.OldCar;

// �ٱ� -> Car Ŭ����
public class Car {

	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	static String color; // ����

	Car() {
		System.out.println("Car ȣ��");
	}

	// ��ø Ŭ���� (�ν��Ͻ� ��� Ŭ����)
	class OldCar { 

		int speed; // �ӵ�
		int cost; // ���� 

		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}
		 
		void carCall() {  
			// �ν��Ͻ� �޼ҵ忡�� �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������ (����x)
			company="����";
			stop();
		}
	}

	
	// ���� ��� Ŭ���� 
	static class Truck {
		
		static int speed;
		int cost;
		
		Truck() {
			System.out.println("Truck ȣ��");
		}
		
		void speedUp(int speed) {
			this.speed +=speed;
		}
		
		void carCall() {
			//���� Ŭ������ �޼ҵ忡��
			//�ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� �ȵ�
			// company="����";
			// stop();
			color="����";
			stop2();
		}
	}
	
	void speedUp(int speed) { // �Ű����� 1�� ����x �޼ҵ�
		this.speed += speed;
	}
	
	void stop() {
		System.out.println("Car ����");
	}
	
	static void stop2() {
		System.out.println("Car ����");
	}
	
}
