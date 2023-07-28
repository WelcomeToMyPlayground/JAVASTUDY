package sec02;

public class ATM implements Runnable {

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {  //  synchronized: 특정한 대상에 lock을 걸어서 lock이 풀릴 때까지 다른 스레드가 실행 하지 못하게 함
		for (int i = 0; i < 10; i++) {
			// object 메소드
			// 쓰레드 중 하나를 깨움
			notify();
			try {
				// 갖고 있던 고유 락을 해제하고 스레드를 잠들게 함
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
		System.out.printf("잔액: %,d 원 %n", getDepositeMoney());
	} else {
		System.out.println(Thread.currentThread().getName()+" , ");
		System.out.println("잔액이 부족합니다.");
	}
}

	private long getDepositeMoney() {
		return depositeMoney;
	}
}
