package chap12.sec01;

public class ThreadA extends Thread{

	public ThreadA() {
		setName("������ A");
	}

	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}
	
}
