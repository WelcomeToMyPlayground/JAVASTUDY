package sec01;

public interface RemoteControl {

	// public int s = 3; // X
	// �������̽� �ʵ� �ùٸ� ��� ����� �ƴ�
	// �������̽� �ʵ�� ��� �ʵ常 ��� �����ϹǷ�
	// �ʵ� �̸��� �빮�ڷ� ���� ���� ������
	
	// ��� �ʵ�
	public int MIN_VOLUME = 0; // O
	public int MAX_VOLUME = 10;
	// �������̽� ����� �ݵ�� ����� ���ÿ� �ʱⰪ�� �����ؾ� ��
	
	// public String Name; // X
	// ��� �ʵ�� �ݵ�� �ʱⰪ�� �־�� ��
	public String NAME = "ȫ�浿";
	
	// �߻� �޼ҵ� (�������̽� �޼ҵ�� �߻� �޼ҵ�� ������)
	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	
}	
