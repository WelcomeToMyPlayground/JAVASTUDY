package sec01.practice;

// ��� ���
public class Sleep extends Thread {

	@Override
	public void run() {		
		try {
			Thread.sleep(3000);   // 3��
		} catch (Exception e) {
		} System.out.println("���� ��ϴ�");
	}
}
