package sec01;

public class CellPhone {
	// 필드
	// private String model; !! private 붙으면 상속 불가능!! -> 외부에서 바로 접근 불가능 
	// -> getter,setter 이용해서 접근
	String model;
	String color;

	// 생성자 -> 컴퓨터가 자동으로 디폴드 생성자 만듦 (눈에 안보임)

	// 메소드
	// default 접근제한: 같은 패키지에서는 아무런 제한 없이 생성자를 호출 가능
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void Bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
