package sec02;
//Tire 클래스
public class Tire {

	// 멤버 필드
	public int maxRotation; 			// 최대 회전수
	public int accumulatedRotation;	    // 누적 회전수
	public String location; 			// 타이어 위치

	// 생성자1) 매개변수 2개
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// 메소드 매개변수 x , 리턴타입 boolean
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1씩 증가
		
		// 누적회전수가 최대회전수보다 작으면 회전수 증가시키고
		// 몇회 회전했는지 (타이어 수명) 출력
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		
			// 누적회전수가 최대회전수 이상이면 타이어 펑크 출력
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}

	}
}
