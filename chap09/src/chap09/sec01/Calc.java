package chap09.sec01;

import java.util.Scanner;

public abstract class Calc {
	
	// �ʵ�
	int a;
	int b;
	String name;
	
	// �޼ҵ�
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void calculate() {
		
	}
	
	////////////�߻� Ŭ���� ���////////////////////////////////////////////////
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
		Calc c; // ��ü ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��ϼ���");
		int num1 = s.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ���");
		int num2 = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		char a = s.next().charAt(0);
		
		switch(a) {
		case('+') :
			//Calc c = new add();
		}
		
		
	}
}