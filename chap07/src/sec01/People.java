package sec01;

public class People {  // �θ� People Ŭ����

	public String name; // �̸�
	public String ssn; // �ֹι�ȣ

	// �⺻ �����ڰ� ���� 
	// name�� ssn�� �Ű������� �޾� ��ü�� ������Ű�� �����ڸ� ���� (�Ű����� 2��¥��)
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// �׷��� ������ People�� ����ϴ� Student Ŭ������
	// �����ڿ��� super(name,ssn)���� People Ŭ������ �����ڸ� ȣ���ؾ� ��
}
