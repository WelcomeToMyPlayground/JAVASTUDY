package sec02.exam01;

public class Carexample {

	public static void main(String[] args) {
		
		//����Ʈ ������ ������ ���ǿ� �´� �Ű����� �� �Ѱ��ֱ�!
		// Truck truck = new Truck();   - ����
		
		Truck truck = new Truck("���","����",3,"��");
		
		Car car = truck;  // �ڵ� Ÿ�� ��ȯ
		
		car.speedUp(30); // �θ� �޼ҵ� ȣ��
		// car.maxSpeed(50); // ���� - Ÿ���� ��ȯ�Ǿ��� ������ �ڽ� �޼ҵ� ȣ�� �Ұ���
		
		car.start();     // �������̵��� �޼ҵ�� Ÿ�Ժ�ȯ �Ŀ��� �ڽ� �޼ҵ� ȣ�� ����
		
		
		//
		truck.maxSpeed(3);
		truck.speedUp(3);
	
	}

}
