package sec02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();   // Driver Ŭ���� ��ü ����
		Bus bus = new Bus();			// Bus Ŭ���� ��ü ����
		Taxi taxi = new Taxi();			// Taxi Ŭ���� ��ü ����
		
		bus.run();
		taxi.run();
		
		// driver.drive();   drive �޼ҵ�� �Ű������� �־�� ��
		
		driver.drive(bus);   // Ŭ���� Ÿ���� �Ű����� �߰���
		// -> 16������ ��� ������ Bus ��ü��  run() �޼ҵ带 ������ ���
		
		driver.drive(taxi);  // �ڵ� Ÿ�� ��ȯ: Vehicle vehicle = taxi;
		// -> 19������ ��� ������ Taxi ��ü��  run() �޼ҵ带 ������ ���
		
		// ��°��
		//������ �޸��ϴ�.
		//�ýð� �޸��ϴ�.
		//������ �޸��ϴ�.
		//�ýð� �޸��ϴ�.	
	}

}
