package sec03;

public class Student1 {
	
	String name;
	int age;
	String studentNumber;
	String phoneNumber;
	
	public Student1() {
		// �⺻ ������
	}
	
	public Student1(String name, int age) {
		// �Ű����� 2�� ������
		this.name = name;
		this.age = age;	
	}
	
	public Student1(String name, String studentNumber, String phoneNumber) {
		// �Ű����� 3�� ������
		this.name = name;
		this.studentNumber = studentNumber ;
		this.phoneNumber= phoneNumber;
		
	}
}	
	