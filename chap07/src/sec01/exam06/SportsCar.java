package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop(){   //final �޼ҵ�� �������̵� �Ұ���
//		System.out.println("������ī�� ����");
//		speed =0;
//	}
	
	public void stop(int x) {
		// ���ϰ��̳� �Ű�����!�� �����ϸ� �޼ҵ� �������̵� �ƴ�! �ƿ� �ٸ� ��
		System.out.println("������ī�� ����");
		speed = 0;
	}
	
}
