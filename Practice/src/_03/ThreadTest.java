package _03;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start(); // �������� run �޼��� ȣ��
		t2.start();
		
		System.out.println("main ����");
		// t1, t2,  main ������ 
		// ��, 3���� ��Ƽ ������� ����ȴ�.
		
	
	}

}
