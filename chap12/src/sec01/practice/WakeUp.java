package sec01.practice;

// ����
public class WakeUp implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000); // 1��
		} catch (Exception e) {
		} System.out.println("����մϴ�");
	}
}
