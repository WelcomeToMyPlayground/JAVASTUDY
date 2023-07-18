package sec01;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff(); // 부모 클래스 메소드 호출 - 이륙합니다
		sa.fly(); // 일반비행합니다
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // 초음속비행합니다
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); // 일반비행합니다
		sa.land(); // 부모 클래스 메소드 호출 - 착륙합니다

		// 출력 결과

		// 이륙합니다
		// 일반비행합니다
		// 초음속비행합니다.
		// 일반비행합니다
		// 착륙합니다.

	}

}
