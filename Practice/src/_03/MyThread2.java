package _03;

public class MyThread2 extends Thread{

	@Override
	public void run() {
		System.out.println(getName()); // Thread-1
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000); // 2�ʾ� sleep
			} catch(InterruptedException error) {
				error.printStackTrace(); // ���� �߻��� ������ ���
			}
			System.out.println("#");
		}
	}

	
}
