package sec02;

public class Car {
	
	// �������̽� Ÿ�� �ʵ� ����!�� �ʱ� ���� ��ü ����
	// Tire �������̽��� �ڵ� ��ȯ�Ǿ����� 
	// �������̵�� roll �޼ҵ�� ������ �Ѿ
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// �������̽����� ����� roll() �޼ҵ� ȣ��
	// ����(Car) �޼ҵ���
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); 
		
		// ���: �ѱ� Ÿ�̾ �������ϴ�. * 4 ���
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.run();
		
		// ���: ��ȣ 1 �ѱ� 3 ���
	}
}
