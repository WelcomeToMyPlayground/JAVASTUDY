package _03;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start(); // 스레드의 run 메서드 호출
		t2.start();
		
		System.out.println("main 종료");
		// t1, t2,  main 스레드 
		// 즉, 3개의 멀티 스레드로 실행된다.
		
	
	}

}
