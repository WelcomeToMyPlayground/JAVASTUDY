package sec02;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	void stop() {
		System.out.println("������ ����ϴ�.");
	}
}
