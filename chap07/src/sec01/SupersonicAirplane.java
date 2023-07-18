package sec01;

public class SupersonicAirplane extends AirPlane {

	// 정적 상수 2개 생성, 상수 이름은 관례적으로 대문자를 씀
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); // 부모 (AirPlane) 클래스의 fly() 메소드 호출
		}
	}

}
