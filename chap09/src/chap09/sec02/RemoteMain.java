package chap09.sec02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote rm = new Remote();
		rm.rc.turnOn();	// 익명 구현 개체 필드 사용
		rm.method1();	// 익명 구현 객체 메소드 내부 로컬 변수 사용
		
		// 매개변수로 익명 구현 객체 사용
		rm.method2(	
			new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("스마트 TV를 켭니다.");
					
				}

				@Override
				public void turnOff() {
					System.out.println("스마트 TV를 끕니다.");
					
				}
			}	
		);
	}
}
