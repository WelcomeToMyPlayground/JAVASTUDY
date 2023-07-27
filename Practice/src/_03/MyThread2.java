package _03;

public class MyThread2 extends Thread{

	@Override
	public void run() {
		System.out.println(getName()); // Thread-1
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000); // 2초씩 sleep
			} catch(InterruptedException error) {
				error.printStackTrace(); // 에러 발생의 원인을 출력
			}
			System.out.println("#");
		}
	}

	
}
