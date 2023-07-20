package chap09.sec02;

// 익명 객체 = 한 번만 사용!
public class Car2 {
	
	// 필드 값으로 익명 객체를 대입하세요
	// car 메소드를 오버라이드 하고 
	// speedUp(int speed) 메소드 만드세요
	
	Car car = new Car() {
		int speed;
		
		void speedUp(int speed) {
			this.speed=speed;
			System.out.println("속도가 "+speed+"만큼 증가되었습니다.");
		}
		@Override
		void stop() {
			System.out.println("자동차가 멈춥니다.");
			speedUp(50);
		}
		
	};  // 익명 객체라서 끝에 세미콜론(;) 추가
	
	// 로컬 익명 객체 대입
	void speedDown() {
		Car downCar = new Car() {
			
			void speedDown(int speed) {
				this.speed =speed;
			}
			@Override
			void stop() {
				speedDown(30);
				System.out.println("속도가 "+speed+"만큼 감소되었습니다.");
			}
		};
		// speedDown() 메소드를 호출하면 익명 개체 안의 메소드가
		// 자동으로 실행되지 않기 때문에 downCar.stop()을 호출해줘야 함!!
		downCar.stop();
	}
}
