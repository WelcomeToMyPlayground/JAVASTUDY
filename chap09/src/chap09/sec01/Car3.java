package chap09.sec01;

// Car Ŭ����
public class Car3 {

	// �ʵ�
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	String color; // ����..

	// ������1
	Car3() {
		// �⺻ ������
	}

	// ������2
	Car3(String company, int cost) { // �Ű����� 2�� ������
		this.company = company;
		this.cost = cost;
	}

	// �޼ҵ�1
	void speedUp(int speed) { // �Ű����� 1��, void�� �������� �ʴ� �޼ҵ�
		this.speed += speed;
	}

	void OldSpeed() {
		// Car Ŭ���� ���ο����� OldCar ��ü �ٷ� ���� ������
		OldCar2 old = new OldCar2();
		old.speed = 50;
	}

// OldCar Ŭ����
	public static class OldCar2 {
		// �ʵ�
		int speed; // �ӵ�
		int cost; // ����

		// �޼ҵ� (�Ű����� 1��, void�� ���ϰ� X)
		void speedUp(int speed) {
			this.speed += speed;
		}
	}
}

	class Car4 {
		// ���� Ŭ������ ���� Ŭ������ ��ü�� �������� �ʰ�
		// �ٷ� ��ü ���� ������
		Car3.OldCar2 old = new Car3.OldCar2();

}
