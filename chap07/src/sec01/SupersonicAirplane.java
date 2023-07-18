package sec01;

public class SupersonicAirplane extends AirPlane {

	// ���� ��� 2�� ����, ��� �̸��� ���������� �빮�ڸ� ��
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly(); // �θ� (AirPlane) Ŭ������ fly() �޼ҵ� ȣ��
		}
	}

}
