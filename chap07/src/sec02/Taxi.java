package sec02;

public class Taxi extends Vehicle{
	
	// 부모 클래스의 run 메소드 오버라이드(재정의
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	
}
