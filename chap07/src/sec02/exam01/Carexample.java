package sec02.exam01;

public class Carexample {

	public static void main(String[] args) {
		
		//디폴트 생성자 없으니 조건에 맞는 매개변수 꼭 넘겨주기!
		// Truck truck = new Truck();   - 에러
		
		Truck truck = new Truck("흰색","벤츠",3,"중");
		
		Car car = truck;  // 자동 타입 변환
		
		car.speedUp(30); // 부모 메소드 호출
		// car.maxSpeed(50); // 에러 - 타입이 변환되었기 때문에 자식 메소드 호출 불가능
		
		car.start();     // 오버라이딩된 메소드는 타입변환 후에도 자식 메소드 호출 가능
		
		
		//
		truck.maxSpeed(3);
		truck.speedUp(3);
	
	}

}
