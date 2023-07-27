package chap12.sec01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					if (i % 2 == 1) {
					try {Thread.sleep(500);} catch (Exception e) {}
						System.out.print(i+" ");
				}
			}
		}
});
		thread.start();
			
	}
}
