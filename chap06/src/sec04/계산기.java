package sec04;

public class 계산기 {
	
	void powerOn() {   // 입력값이 없어서 호출만 하면 됨
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	
	int plus (int x, int y) { 
		
		 int result = x + y;
		 return result;
	}
	
	int minus (int x, int y) {
		int result;
		
		if(y > x) {
			result = y - x;
		} else {
			result = x - y;
		}
		return result;
	}
		
	int mul1 (int x, int y) {
	
		int result = x * y ;
		return result;
	}
	
	// 문제: 둘 중 값이 하나라도 0이면, 0은 화면상에 출력할 수 없습니다 
	// 숫자 -> 문자열 String.valueOf();	
	String mul (int x, int y) {			
		if (x == 0 || y == 0) {
			String m = "0은 입력할 수 없습니다";
			return m;
		} else {
			int result = x * y;
			return String.valueOf(result);
		}
	}
	
	double divide(int x, int y) {
		double result = (double) x/y;
		return result;
	}
	
	
}
