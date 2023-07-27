package chap12.sec01;

public class Car implements Runnable{
	
	int speed = 50;
	
	@Override
	public void run() {
		
		for(int i=0;i<=4;i++) {
			System.out.println("현재 속도"+speed);
			speed+=50;
		}  try {Thread.sleep(500);} catch (Exception e) {}
	}

	
}
