package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar ();
		
		// �ܺ� ȣ��
		myCar.keyTurnOn();    // Ű�� �����ϴ�
		myCar.run();		  // �޸��ϴ� (�ݺ���)
		
		int speed = myCar.getSpeed();   // speed�� 
		System.out.println("���� �ӵ�: " + speed + "km/h");
		
	}

}
