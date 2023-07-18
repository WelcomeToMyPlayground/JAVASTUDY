package chap09.sec01;

import chap09.sec01.Car.OldCar;

// Car 클래스
public class Car {

	// 필드
	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	String color; // 색상

	// 생성자1
	Car() {
		// 기본 생성자
	}

	// 생성자2
	Car(String company, int cost) { // 매개변수 2개 생성자
		this.company = company;
		this.cost = cost;
	}

	// 메소드1
	void speedUp(int speed) { // 매개변수 1개, void라서 리턴하지 않는 메소드
		this.speed += speed;
	}

	void OldSpeed() {
		// Car 클래스 내부에서는 OldCar 객체 바로 생성 가능함
		OldCar old = new OldCar();
		old.speed = 50;
	}

// OldCar 클래스
	class OldCar {
		// 필드
		int speed; // 속도
		int cost; // 가격

		// 메소드 (매개변수 1개, void라서 리턴값 X)
		void speedUp(int speed) {
			this.speed += speed;
		}
	}
}

	class Car2 {

		Car car = new Car("현대",300000);
		Car.OldCar oldcar = car.new OldCar();
		
		// car.speedUp(50);  // 왜 오류 발생 ? 

}
