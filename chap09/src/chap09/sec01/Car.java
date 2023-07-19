package chap09.sec01;

import chap09.sec01.Car.OldCar;

// 바깥 -> Car 클래스
public class Car {

	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	static String color; // 색상

	Car() {
		System.out.println("Car 호출");
	}

	// 중첩 클래스 (인스턴스 멤버 클래스)
	class OldCar { 

		int speed; // 속도
		int cost; // 가격 

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}
		 
		void carCall() {  
			// 인스턴스 메소드에서 바깥 클래스의 필드와 메소드 접근 가능함 (정적x)
			company="현대";
			stop();
		}
	}

	
	// 정적 멤버 클래스 
	static class Truck {
		
		static int speed;
		int cost;
		
		Truck() {
			System.out.println("Truck 호출");
		}
		
		void speedUp(int speed) {
			this.speed +=speed;
		}
		
		void carCall() {
			//정적 클래스의 메소드에서
			//바깥 클래스의 필드와 메소드 접근 안됨
			// company="현대";
			// stop();
			color="빨강";
			stop2();
		}
	}
	
	void speedUp(int speed) { // 매개변수 1개 리턴x 메소드
		this.speed += speed;
	}
	
	void stop() {
		System.out.println("Car 멈춤");
	}
	
	static void stop2() {
		System.out.println("Car 멈춤");
	}
	
}
