package sec02;

public class 학생예제1 {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		Student s = new Student();
		
		System.out.println(s.name);
		
		
		s.dept = "법학과";   // 변경
		System.out.println(s.dept);
		

	}

}
