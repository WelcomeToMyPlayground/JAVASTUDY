package sec02;

public class Driver {

	// �Ű������� �������̽� ��ü�� �޼ҵ�	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

		
	// main -> ����	
	public static void main(String[] args) {
		// Driver ��ü ����
		Driver driver = new Driver();
		
		Bus bus = new Bus();  	 // Bus ��ü ����
		Taxi taxi = new Taxi();  // Taxi ��ü ����
		
		driver.drive(bus);
		// bus ��ü�� �Ű������� �Ѱ���
		// bus�� Vehicle �������̽��� ���� ��ü�̹Ƿ�
		// Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ� ��
		
		// driver.stop();  // ���� �߻�
		// bus�� Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ� 
		// �������̵�� run�� ��밡��������, stop�� ��� �Ұ��� 
	}

}
