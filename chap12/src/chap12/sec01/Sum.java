package chap12.sec01;

public class Sum implements Runnable {

	@Override
	public void run() {
		// 1���� 10���� Ȧ���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i+" ");
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
