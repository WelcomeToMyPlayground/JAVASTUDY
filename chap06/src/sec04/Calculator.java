package sec04;

// 틀
public class Calculator {
	
	// 3
	int plus(int x, int y) {        // 합계를 구하는 메소드
		int result = x + y;
		return result;
	}
	// 2
	double avg(int x, int y) {	    // 평균을 구하는 메소드
		double sum = plus(x,y);     // 객체 내부에서 합계 메소드 호출			
		double result = sum / 2;
		return result;
	}

	// 1
	void excute() {
		double result = avg(7, 10);
		println("실행결과: " + result);      // 문자열 + 숫자 = 문자열 , println이라는 메소드임
	}
	
	// 4
	void println(String message) {
		System.out.println(message);
	}
}
