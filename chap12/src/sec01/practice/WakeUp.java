package sec01.practice;

// 구현
public class WakeUp implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000); // 1초
		} catch (Exception e) {
		} System.out.println("기상합니다");
	}
}
