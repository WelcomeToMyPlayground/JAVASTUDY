package chap09.sec02;

public interface RemoteControl {
	String COMPANY="삼성";
	int COST=5000;
	// 인터페이스 필드는 상수 필드를 사용해야 함!!
	
	
	// 추상 메소드^^
	public void turnOn();
	public void turnOff();
	
}
