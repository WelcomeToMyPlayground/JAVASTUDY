package sec03;

public class Student1 {
	
	String name;
	int age;
	String studentNumber;
	String phoneNumber;
	
	public Student1() {
		// 기본 생성자
	}
	
	public Student1(String name, int age) {
		// 매개변수 2개 생성자
		this.name = name;
		this.age = age;	
	}
	
	public Student1(String name, String studentNumber, String phoneNumber) {
		// 매개변수 3개 생성자
		this.name = name;
		this.studentNumber = studentNumber ;
		this.phoneNumber= phoneNumber;
		
	}
}	
	