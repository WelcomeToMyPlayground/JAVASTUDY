package sec03;

// �����ڴ� �ݵ�� Ŭ������� �����ϰ� ������ ��!!
// ������ �տ��� ���� ������(public ��)�� �� �� �ִ�.

public class Student��ü {

	String name;    			// �̸�
	int age;       				// ����
	String studentNumber;  		// �й�
	String gender;				// ����
	String phone;				// ����ó
	
	public Student��ü() {
		// �⺻ ������
	}
	
	public Student��ü (String name, int age) {   
		// �Ű����� 2�� ������
		this.name = name;
		this.age = age;
	}
	
	public Student��ü (String name, String studentNumber, String phone) {
		// �Ű����� 3�� ������
		this.name = name;
		this.studentNumber = studentNumber;
		this.phone = phone;
		
	}
}
