package sec03;

public abstract class Animal {  // �߻� Ŭ���� 

	public String kind; // ���� ����

	public void breathe() {// �޼ҵ�
		System.out.println("���� ���ϴ�.");
	}

	public abstract void sound(); // �߻� �޼ҵ�
}