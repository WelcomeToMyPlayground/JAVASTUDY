package sec03;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone  = new Phone("홍길동"); 에러
		// -> 추상 클래스는 직접 객체 생성이 안됨
		
		SmartPhone smartphone = new SmartPhone("홍길동", 1200000);
		// 추상클래스는 다이렉트로 접근 불가능
		
		smartphone.turnOn();   		  // 추상 클래스의 메소드
		smartphone.internetSearch();  // 객체 메소드
		
	}

}
