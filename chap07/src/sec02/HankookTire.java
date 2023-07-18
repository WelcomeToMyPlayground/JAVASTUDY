package sec02;
// Tire의 자식 클래스
public class HankookTire extends Tire {
	
	// 부모 클래스의 생성자 호출
	public HankookTire(int maxRotaion, String location) {
		super(maxRotaion,location);
	}
	
	//부모 클래스의 메소드 오버라이드
	// 다른 내용을 출력하기 위해 재정의한 roll() 메소드
	@Override
	public boolean roll() {
			++accumulatedRotation; // 누적 회전수 1씩 증가
			if (accumulatedRotation < maxRotation) {
				System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
				return true;
			} else {
				System.out.println("*** " + location + "HankookTire 펑크 ***");
				return false;
			}	
	}
}
