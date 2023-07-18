package sec01;

public class 학생실행구문 {

	public static void main(String[] args) {
		
		Student s = new Student(80, 190, 1234);
		String result = s.eat("피자");
		System.out.println(result);
		System.out.println(s.eat("돈가스")); // 이렇게 쓰면 바로 출력도 가능

		// 출력 결과
		// 피자를 매일 먹어요
		// 돈가스를 매일 먹어요

	}

}
