package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println(student.name); // 부모에게 상속받은 필드 출력
		System.out.println(student.ssn);  // 부모에게 상속받은 필드 출력
		System.out.println(student.studentNo); // 본인 필드 출력
		
		// 출력내용
		// 홍길동
		// 123456-1234567
		// 1
	}

}
