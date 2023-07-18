package sec02.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run(); // 오버라이드된 run은 호출 가능
		// vehicle.stop(); // 구현 객체 메소드 바로 호출 불가능
		
		Bus bus = (Bus) vehicle; // 구현 객체 타입으로 강제 변환 (후)
		bus.stop();  // 구현 객체 메소드 호출 가능	
		
		// Vehicle vehicle2 = new Vehicle();  // 불가능
		// 인터페이스는 객체 생성이 불가능함, 생성자도 만들 수 없음, 구현 객체를 통해서만 접근 가능
		
		// 인터페이스 다중 상속 허용
		

	}

}
