package chap12.sec01;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("�⺻ ������ �̸� : " + mainThread.getName() );
		
		ThreadA threadA = new ThreadA(); // threadA ����
		System.out.println("ù ��° �۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		

		ThreadB threadB = new ThreadB(); // threadB ����
		System.out.println("ù ��° �۾� ������ �̸� : " + threadB.getName());
		threadB.start();
	}

}
