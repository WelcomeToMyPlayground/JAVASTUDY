package sec02;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotaion, String location) {
		super(maxRotaion, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1�� ����
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire ��ũ ***");
			return false;

		}
	}
}
