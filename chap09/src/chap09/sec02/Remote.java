package chap09.sec02;

public class Remote {
	
	// �͸� ���� ��ü ����
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
			
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
			
		}	
	};
	
	// �޼ҵ� ���� ���� ������ �͸� ���� ��ü ���
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
				
			}
				
		};
		// �͸� ���� ��ü ���� �޼ҵ�� 
		// �ݵ�� �ܺ� �޼ڵ忡�� ȣ������� ��
		localVar.turnOn();
		localVar.turnOff();
	}
	// �Ű������� �͸� ���� ��ü�� ����ϴ� �޼ҵ�
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
