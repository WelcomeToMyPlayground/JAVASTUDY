package sec01.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car =new Truck();
		
		car.speedUp(30);
		car.speedDown(300);
		
		// ���� Car�� ������ SportCar Ŭ������ �ִٸ�
		// car = new SportCar(); �� �̿��Ͽ�
		// car �������̽� �ϳ��� �� ��ü�� ���� ���� ������
		
		car = new SportCar();
		car.speedUp(50);
		car.speedUp(20);
	}

}
