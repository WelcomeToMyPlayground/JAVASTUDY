package sec04;

// 학생예제 main 클래스
public class 학생예제 {

	// 실행은 main 구문에서
	public static void main(String[] args) {
		
		// 학생 클래스 객체 생성
		// 매개변수로 성별/학과코드/시험성적 넘겨줌
		
		// 생성자 이름은 class 이름과 동일 
		학생 st = new 학생("남", "A123", 77);  // 보내고
		st.start();							   // 호출
		
	}

	
}