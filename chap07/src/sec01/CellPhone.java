package sec01;

public class CellPhone {
	// �ʵ�
	// private String model; !! private ������ ��� �Ұ���!! -> �ܺο��� �ٷ� ���� �Ұ��� 
	// -> getter,setter �̿��ؼ� ����
	String model;
	String color;

	// ������ -> ��ǻ�Ͱ� �ڵ����� ������ ������ ���� (���� �Ⱥ���)

	// �޼ҵ�
	// default ��������: ���� ��Ű�������� �ƹ��� ���� ���� �����ڸ� ȣ�� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void Bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void sendVoice(String message) {
		System.out.println("�ڱ�: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("����: " + message);
	}

	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}

}
