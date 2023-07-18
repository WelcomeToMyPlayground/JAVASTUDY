package sec02.exam01;
// 최상위 객체
public class Car {
	
	//멤버필드 4개
	// 디폴트 -> 같은 패키지 안에서만 가능
	String color;   // 자동차 색상
	String company; // 제조 회사
	int speed;  	// 속도
	int cost;  		// 가격
	
	
	// 생성자!! 만들기 -> 우클릭
	// 생성자를 따로 만들게되면 기본 생성자는 만들어지지 않는다
	
	// 매개변수 2개인 생성자
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}
	
	// 메소드!!
	
	// int 타입을 받는 매개변수 1개짜리 메소드, void 사용했기 때문에 리턴타입은 없음
	// 매개변수의 숫자만큼 스피드 증가
	void speedUp(int speed) {		
		this.speed += speed;
		// 또는 speed += x; 로 표현 가능하나 this 사용을 권장
	}
	
	// int 타입을 받는 매개변수 1개짜리 메소드, void 사용했기 때문에 리턴타입은 없음
	// 매개변수의 숫자만큼 스피드 감소
	void speedDown(int speed) {		
		this.speed -= speed;
		// 또는 speed -= x; 로 표현 가능하나 this 사용을 권장
	}
	

	// 매개변수 없고, 리턴타입 없음
	void start() {
		System.out.println("시동을 걸었습니다.");
	}
	
	// 매개변수 없고, 리턴타입 없음
	void stop() {
		System.out.println("차를 멈춥니다.");
	}
	
}
