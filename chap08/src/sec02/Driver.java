package sec02;

public class Driver {

	// 매개변수가 인터페이스 객체인 메소드	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

		
	// main -> 실행	
	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();  	 // Bus 객체 생성
		Taxi taxi = new Taxi();  // Taxi 객체 생성
		
		driver.drive(bus);
		// bus 객체를 매개변수로 넘겨줌
		// bus는 Vehicle 인터페이스의 구현 객체이므로
		// Vehicle 타입으로 자동 변환되어 들어감
		
		// driver.stop();  // 오류 발생
		// bus는 Vehicle 타입으로 자동 변환되어 
		// 오버라이드된 run은 사용가능하지만, stop은 사용 불가능 
	}

}
