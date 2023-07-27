package _03;
// 스레드 1
public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println(getName());
		// 스레드 클래스 내 getName 메서드. 자동으로 스레드의 번호를 붙여준다 // Thread-0
		for(int i =0; i<10;i++) {
			try {
				Thread.sleep(1000); // 1초씩 sleep
			} catch(InterruptedException error) {
				error.printStackTrace();  // 에러 발생의 원인을 출력
			}
			System.out.println("!");
		}
	}
	
}
