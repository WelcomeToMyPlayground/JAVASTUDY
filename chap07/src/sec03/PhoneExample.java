package sec03;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone  = new Phone("ȫ�浿"); ����
		// -> �߻� Ŭ������ ���� ��ü ������ �ȵ�
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿", 1200000);
		// �߻�Ŭ������ ���̷�Ʈ�� ���� �Ұ���
		
		smartphone.turnOn();   		  // �߻� Ŭ������ �޼ҵ�
		smartphone.internetSearch();  // ��ü �޼ҵ�
		
	}

}
