package sec05;

public class Person {
	
	// �ν��Ͻ� final �ʵ� ����
	final String NATION="Korea";
	final String SSN;
	
	// �ν��Ͻ� �ʵ� ����
	String name;
	
	//������ ����
	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		//��ü ���� �� �ֹε�Ϲ�ȣ�� �̸� ����
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		
		//�ʵ尪 �б�
		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		
		// final �ʵ�� ���� ������ �� ����
		// p1.NATION="usa";       
	}
}
