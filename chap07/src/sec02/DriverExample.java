package sec02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();   // Driver 클래스 객체 생성
		Bus bus = new Bus();			// Bus 클래스 객체 생성
		Taxi taxi = new Taxi();			// Taxi 클래스 객체 생성
		
		bus.run();
		taxi.run();
		
		// driver.drive();   drive 메소드는 매개변수가 있어야 함
		
		driver.drive(bus);   // 클래스 타입의 매개변수 추가함
		// -> 16라인의 출력 내용은 Bus 객체의  run() 메소드를 실행한 결과
		
		driver.drive(taxi);  // 자동 타입 변환: Vehicle vehicle = taxi;
		// -> 19라인의 출력 내용은 Taxi 객체의  run() 메소드를 실행한 결과
		
		// 출력결과
		//버스가 달립니다.
		//택시가 달립니다.
		//버스가 달립니다.
		//택시가 달립니다.	
	}

}
