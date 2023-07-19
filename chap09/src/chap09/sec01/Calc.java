package chap09.sec01;

import java.util.Scanner;

public abstract class Calc {
	
	// 필드
	int a;
	int b;
	String name;
	
	// 메소드
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void calculate() {
		
	}
	
	////////////추상 클래스 상속////////////////////////////////////////////////
	class Add extends Calc {

		@Override
		void calculate() {
			
		}

	}

	class Sub extends Calc {
		@Override
		void calculate() {
			// TODO Auto-generated method stub
			super.calculate();
		}
	}

	class Mul extends Calc {
		@Override
		void calculate() {
			// TODO Auto-generated method stub
			super.calculate();
		}
	}

	class Div extends Calc {
		@Override
		void calculate() {
			// TODO Auto-generated method stub
			super.calculate();
		}
	}

	public static void main(String[] args) {
		Calc c; // 객체 생성
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요");
		int num1 = s.nextInt();
		System.out.println("두 번째 정수를 입력하세요");
		int num2 = s.nextInt();
		System.out.println("연산자를 입력하세요");
		char a = s.next().charAt(0);
		
		switch(a) {
		case('+') :
			//Calc c = new add();
		}
		
		
	}
}