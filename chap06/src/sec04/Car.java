package sec04;

		//�õ��ɱ�, �õ����� return x
		// (�⺻ �ӵ� 100) + �ӵ� 10�� ����
		// ���� - 10 
		// ���� 
public class Car {
	
	
	private int speed = 100;    // �⺻�ӵ�
	
	
	void powerOn() {
		System.out.println("�õ��� �ɷȽ��ϴ�.");
	}
	
	void powerOff() {
		System.out.println("�õ��� �������ϴ�.");
	}
	
	int speedUp (int x) {
		
		speed += x;
		return speed;
	}
	
	int speedDown (int y) {
		
		speed -= y;
		return speed;
	}
	
	int breakZero() {
		speed = 0;
		return speed;
	}

}