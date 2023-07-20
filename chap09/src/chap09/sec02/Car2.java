package chap09.sec02;

// �͸� ��ü = �� ���� ���!
public class Car2 {
	
	// �ʵ� ������ �͸� ��ü�� �����ϼ���
	// car �޼ҵ带 �������̵� �ϰ� 
	// speedUp(int speed) �޼ҵ� ���弼��
	
	Car car = new Car() {
		int speed;
		
		void speedUp(int speed) {
			this.speed=speed;
			System.out.println("�ӵ��� "+speed+"��ŭ �����Ǿ����ϴ�.");
		}
		@Override
		void stop() {
			System.out.println("�ڵ����� ����ϴ�.");
			speedUp(50);
		}
		
	};  // �͸� ��ü�� ���� �����ݷ�(;) �߰�
	
	// ���� �͸� ��ü ����
	void speedDown() {
		Car downCar = new Car() {
			
			void speedDown(int speed) {
				this.speed =speed;
			}
			@Override
			void stop() {
				speedDown(30);
				System.out.println("�ӵ��� "+speed+"��ŭ ���ҵǾ����ϴ�.");
			}
		};
		// speedDown() �޼ҵ带 ȣ���ϸ� �͸� ��ü ���� �޼ҵ尡
		// �ڵ����� ������� �ʱ� ������ downCar.stop()�� ȣ������� ��!!
		downCar.stop();
	}
}
