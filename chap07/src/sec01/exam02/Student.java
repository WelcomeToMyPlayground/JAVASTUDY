package sec01.exam02;

import sec01.People;

public class Student extends People {
	public int studentNo;   // �й�
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);   //(�Ű����� 2��¥��) �θ� ������ ȣ��!!
		this.studentNo = studentNo;  
	}
}
