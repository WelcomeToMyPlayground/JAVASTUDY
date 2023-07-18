package sec02;

public interface Vehicle {
	
	// 인터페이스 필드는 상수 필드만 가능
	// public static final 생략됨
	// 상수는 인터페이스에 고정된 값으로 실행 시에 데이터를 바꿀 수 없음
	
	// [public static final] 타입 상수명 = 값;
	// int WHEELS = 4;
	
	public void run();
	// 인터페이스의 메소드이므로 추상 메소드
	// static abstract 생략됨
}
