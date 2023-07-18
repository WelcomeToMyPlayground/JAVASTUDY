package sec01;

public interface RemoteControl {

	// public int s = 3; // X
	// 인터페이스 필드 올바른 사용 방법이 아님
	// 인터페이스 필드는 상수 필드만 사용 가능하므로
	// 필드 이름을 대문자로 쓰는 것이 관례임
	
	// 상수 필드
	public int MIN_VOLUME = 0; // O
	public int MAX_VOLUME = 10;
	// 인터페이스 상수는 반드시 선언과 동시에 초기값을 지정해야 함
	
	// public String Name; // X
	// 상수 필드는 반드시 초기값을 넣어야 함
	public String NAME = "홍길동";
	
	// 추상 메소드 (인터페이스 메소드는 추상 메소드로 구현함)
	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	
}	
