package sec03;

public class Car {

		String company;
		String model;
		String color;
		int maxspeed;
		int speed;
		
		public Car() {
			//�⺻ ������
		}
		
		public Car(String model, int speed) {  
			// �ʵ�� �Ű����� �̸��� ������ ������ ���
			// this.�ʵ�� ǥ��
			
			this.model = model;
			this.speed = speed;    
		}
		
		public Car(String model, String color, int maxspeed) {  // 
			
			this.model = model;
			this.color = color;
			this.maxspeed = maxspeed;
		}
}
