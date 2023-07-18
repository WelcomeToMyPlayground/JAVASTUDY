package sec02;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotaion, String location) {
		super(maxRotaion, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1씩 증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;

		}
	}
}
