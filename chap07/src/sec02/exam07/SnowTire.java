package sec02.exam07;

public class SnowTire extends Tire {
	
	int cost; //가격
	String condition;  // 타이어 마모 상태
	boolean chain;     // 체인 유무
	
	
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다");
	}
	
	public void stop() {
		System.out.println("스노우 타이어가 멈춥니다");
		}
	
}
