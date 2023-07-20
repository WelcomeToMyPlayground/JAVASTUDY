package chap09.sec01;

import java.util.Scanner;

public abstract class Calc {
	
	// 필드
	protected int a;
	protected static int b;
	String name;
	
	// 메소드
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
}	
	////////////////////////////////////////////////////////////////
	class Add extends Calc {
		public int calculate() {
			return a+b;
		}
	}

	class Sub extends Calc {
		public int calculate() {
		return a-b;
		}
	}

	class Mul extends Calc {		
		public int calculate() {
			return a*b;
		}
	}

	class Div extends Calc {
		public int calculate() {
			return a/b;
		}
	///////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int result = 0; // 계산결과를 저장할 변수
		Calc c; 	    // 추상 클래스의 객체 생성
		
		System.out.println("첫 번째 정수를 입력하세요");
		int num1 = s.nextInt();
		System.out.println("두 번째 정수를 입력하세요");
		int num2 = s.nextInt();
		System.out.println("연산자를 입력하세요");
		char a = s.next().charAt(0);
		
		
		switch(a) {
		case('+') :
			c = new Add(); // 추상 클래스를 상속받은 Add 클래스 객체 대입
			break;
		case('-') :
			c = new Sub();
			break;
		case('*') :
			c = new Mul();
			break;
		case('/') :
			c = new Div();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			return;
		}
		
		c.setValue(a,b);  // 추상 클래스 메소드 호출
		result = c.calculate();
		// 상속받은 각 클래스의 오버라이드한 메소드 호출
		System.out.println(result);
	}
}