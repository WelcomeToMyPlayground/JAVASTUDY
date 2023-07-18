package sec02;
//Tire Ŭ����
public class Tire {

	// ��� �ʵ�
	public int maxRotation; 			// �ִ� ȸ����
	public int accumulatedRotation;	    // ���� ȸ����
	public String location; 			// Ÿ�̾� ��ġ

	// ������1) �Ű����� 2��
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// �޼ҵ� �Ű����� x , ����Ÿ�� boolean
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1�� ����
		
		// ����ȸ������ �ִ�ȸ�������� ������ ȸ���� ������Ű��
		// ��ȸ ȸ���ߴ��� (Ÿ�̾� ����) ���
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		
			// ����ȸ������ �ִ�ȸ���� �̻��̸� Ÿ�̾� ��ũ ���
		} else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}

	}
}
