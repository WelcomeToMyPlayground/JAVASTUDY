package sec02;
// Tire�� �ڽ� Ŭ����
public class HankookTire extends Tire {
	
	// �θ� Ŭ������ ������ ȣ��
	public HankookTire(int maxRotaion, String location) {
		super(maxRotaion,location);
	}
	
	//�θ� Ŭ������ �޼ҵ� �������̵�
	// �ٸ� ������ ����ϱ� ���� �������� roll() �޼ҵ�
	@Override
	public boolean roll() {
			++accumulatedRotation; // ���� ȸ���� 1�� ����
			if (accumulatedRotation < maxRotation) {
				System.out.println(location + " HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
				return true;
			} else {
				System.out.println("*** " + location + "HankookTire ��ũ ***");
				return false;
			}	
	}
}
