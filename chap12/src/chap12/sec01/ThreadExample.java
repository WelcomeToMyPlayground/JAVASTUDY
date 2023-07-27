package chap12.sec01;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("기본 스레드 이름 : " + mainThread.getName() );
		
		ThreadA threadA = new ThreadA(); // threadA 생성
		System.out.println("첫 번째 작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		

		ThreadB threadB = new ThreadB(); // threadB 생성
		System.out.println("첫 번째 작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}

}
