package sec05;

public class Person {
	
	// 인스턴스 final 필드 선언
	final String NATION="Korea";
	final String SSN;
	
	// 인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		//객체 생성 시 주민등록번호와 이름 전달
		Person p1 = new Person("123456-1234567", "홍길동");
		
		//필드값 읽기
		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		
		// final 필드는 값을 변경할 수 없음
		// p1.NATION="usa";       
	}
}
