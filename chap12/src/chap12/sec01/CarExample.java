package chap12.sec01;

public class CarExample {

	public static void main(String[] args) {
		
		System.out.println("���� ����մϴ�.");
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=50; i<=200; i+=50) {
					 try {Thread.sleep(500);} catch (Exception e) {}
					 System.out.print("���� �ӵ� "+ i+"km");
					 System.out.println();
				}
			}
	});
		thread.start();
		
		for(int i=0; i<4; i++) {
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.print("�ӵ��� �ø��ϴ�.");
		}
		
		try {Thread.sleep(500);} catch (Exception e) {}
		System.out.println("���� ����ϴ�.");
	}
}