package sec01;

public class StudentExample {

	public static void main(String[] args) {
		
		// 객체 생성 -> 매개변수 3개 넘겨주기
		Student student = new Student(20192231, 11 , 160);
		
		// 자기 메소드 호출
		 student.study("독서실");
		// 부모 메소드 호출
		 
		 String eat = student.eat("밥");
		 System.out.println(eat);
		// System.out.println(student.eat("밥"));  안 받아와도 바로 출력은 됨
		 
		 String speed = student.run(10);
		 System.out.println(speed);
		 
		 //출력결과
		 //독서실에서 공부합니다.
		 //밥을(를) 매일 먹어요
		 //10속도로 달립니다.

	}

}
