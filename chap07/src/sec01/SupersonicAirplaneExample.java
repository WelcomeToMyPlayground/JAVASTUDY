package sec01;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff(); // �θ� Ŭ���� �޼ҵ� ȣ�� - �̷��մϴ�
		sa.fly(); // �Ϲݺ����մϴ�
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // �����Ӻ����մϴ�
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); // �Ϲݺ����մϴ�
		sa.land(); // �θ� Ŭ���� �޼ҵ� ȣ�� - �����մϴ�

		// ��� ���

		// �̷��մϴ�
		// �Ϲݺ����մϴ�
		// �����Ӻ����մϴ�.
		// �Ϲݺ����մϴ�
		// �����մϴ�.

	}

}
