package chap12.sec01;

import java.awt.Toolkit;

public class SumExample {

	public static void main(String[] args) {

		Runnable sum = new Sum();
		Thread thread = new Thread(sum);
		thread.start();

		// 1���� 10���� ¦���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
