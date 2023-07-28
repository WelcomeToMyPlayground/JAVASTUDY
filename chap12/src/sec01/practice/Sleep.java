package sec01.practice;

// 상속 방식
public class Sleep extends Thread {

	@Override
	public void run() {		
		try {
			Thread.sleep(3000);   // 3초
		} catch (Exception e) {
		} System.out.println("잠을 잡니다");
	}
}
