package sec01;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스 1개에 객체 2개를 구현한 상태 
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		// 인터페이스 변수;
		// 변수 = 구현 객체;
		// 인터페이스 변수 = 구현 객체;

	}

}
