package sec02;

public class ATM implements Runnable {

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {  //  synchronized: Ư���� ��� lock�� �ɾ lock�� Ǯ�� ������ �ٸ� �����尡 ���� ���� ���ϰ� ��
		for (int i = 0; i < 10; i++) {
			// object �޼ҵ�
			// ������ �� �ϳ��� ����
			notify();
			try {
				// ���� �ִ� ���� ���� �����ϰ� �����带 ���� ��
				wait();
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
			if (getDepositeMoney() <= 0)
				break;
			withDraw(1000);
			
		}
	}
}

	public void  withDraw(long howMuch) {
	if(getDepositeMoney()>0) {
		depositeMoney -= howMuch;
		System.out.print(Thread.currentThread().getName()+" , ");
		System.out.printf("�ܾ�: %,d �� %n", getDepositeMoney());
	} else {
		System.out.println(Thread.currentThread().getName()+" , ");
		System.out.println("�ܾ��� �����մϴ�.");
	}
}

	private long getDepositeMoney() {
		return depositeMoney;
	}
}
