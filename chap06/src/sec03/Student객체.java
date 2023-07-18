package sec03;

// 생성자는 반드시 클래스명과 동일하게 정의할 것!!
// 생성자 앞에는 접근 제어자(public 등)만 올 수 있다.

public class Student객체 {

	String name;    			// 이름
	int age;       				// 나이
	String studentNumber;  		// 학번
	String gender;				// 성별
	String phone;				// 연락처
	
	public Student객체() {
		// 기본 생성자
	}
	
	public Student객체 (String name, int age) {   
		// 매개변수 2개 생성자
		this.name = name;
		this.age = age;
	}
	
	public Student객체 (String name, String studentNumber, String phone) {
		// 매개변수 3개 생성자
		this.name = name;
		this.studentNumber = studentNumber;
		this.phone = phone;
		
	}
}
