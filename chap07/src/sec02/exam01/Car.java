package sec02.exam01;
// �ֻ��� ��ü
public class Car {
	
	//����ʵ� 4��
	// ����Ʈ -> ���� ��Ű�� �ȿ����� ����
	String color;   // �ڵ��� ����
	String company; // ���� ȸ��
	int speed;  	// �ӵ�
	int cost;  		// ����
	
	
	// ������!! ����� -> ��Ŭ��
	// �����ڸ� ���� ����ԵǸ� �⺻ �����ڴ� ��������� �ʴ´�
	
	// �Ű����� 2���� ������
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}
	
	// �޼ҵ�!!
	
	// int Ÿ���� �޴� �Ű����� 1��¥�� �޼ҵ�, void ����߱� ������ ����Ÿ���� ����
	// �Ű������� ���ڸ�ŭ ���ǵ� ����
	void speedUp(int speed) {		
		this.speed += speed;
		// �Ǵ� speed += x; �� ǥ�� �����ϳ� this ����� ����
	}
	
	// int Ÿ���� �޴� �Ű����� 1��¥�� �޼ҵ�, void ����߱� ������ ����Ÿ���� ����
	// �Ű������� ���ڸ�ŭ ���ǵ� ����
	void speedDown(int speed) {		
		this.speed -= speed;
		// �Ǵ� speed -= x; �� ǥ�� �����ϳ� this ����� ����
	}
	

	// �Ű����� ����, ����Ÿ�� ����
	void start() {
		System.out.println("�õ��� �ɾ����ϴ�.");
	}
	
	// �Ű����� ����, ����Ÿ�� ����
	void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
}
