package sec02.exam07;

public class SnowTire extends Tire {
	
	int cost; //����
	String condition;  // Ÿ�̾� ���� ����
	boolean chain;     // ü�� ����
	
	
	@Override
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�");
	}
	
	public void stop() {
		System.out.println("����� Ÿ�̾ ����ϴ�");
		}
	
}
