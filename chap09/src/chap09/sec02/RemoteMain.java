package chap09.sec02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote rm = new Remote();
		rm.rc.turnOn();	// �͸� ���� ��ü �ʵ� ���
		rm.method1();	// �͸� ���� ��ü �޼ҵ� ���� ���� ���� ���
		
		// �Ű������� �͸� ���� ��ü ���
		rm.method2(	
			new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("����Ʈ TV�� �մϴ�.");
					
				}

				@Override
				public void turnOff() {
					System.out.println("����Ʈ TV�� ���ϴ�.");
					
				}
			}	
		);
	}
}
