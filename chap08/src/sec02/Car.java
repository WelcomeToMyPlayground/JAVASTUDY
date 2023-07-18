package sec02;

public class Car {
	
	// 인터페이스 타입 필드 선언!과 초기 구현 객체 대입
	// Tire 인터페이스로 자동 변환되었으나 
	// 오버라이드된 roll 메소드는 가지고 넘어감
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// 인터페이스에서 설명된 roll() 메소드 호출
	// 본인(Car) 메소드임
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); 
		
		// 결과: 한국 타이어가 굴러갑니다. * 4 출력
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.run();
		
		// 결과: 금호 1 한국 3 출력
	}
}
