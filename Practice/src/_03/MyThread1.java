package _03;
// ������ 1
public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println(getName());
		// ������ Ŭ���� �� getName �޼���. �ڵ����� �������� ��ȣ�� �ٿ��ش� // Thread-0
		for(int i =0; i<10;i++) {
			try {
				Thread.sleep(1000); // 1�ʾ� sleep
			} catch(InterruptedException error) {
				error.printStackTrace();  // ���� �߻��� ������ ���
			}
			System.out.println("!");
		}
	}
	
}
