package chap09.sec01;

import java.util.Scanner;

public abstract class Calc {
	
	// �ʵ�
	protected int a;
	protected static int b;
	String name;
	
	// �޼ҵ�
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
		
		int result = 0; // ������� ������ ����
		Calc c; 	    // �߻� Ŭ������ ��ü ����
		
		System.out.println("ù ��° ������ �Է��ϼ���");
		int num1 = s.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ���");
		int num2 = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		char a = s.next().charAt(0);
		
		
		switch(a) {
		case('+') :
			c = new Add(); // �߻� Ŭ������ ��ӹ��� Add Ŭ���� ��ü ����
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
			System.out.println("�߸��� ������ �Դϴ�.");
			return;
		}
		
		c.setValue(a,b);  // �߻� Ŭ���� �޼ҵ� ȣ��
		result = c.calculate();
		// ��ӹ��� �� Ŭ������ �������̵��� �޼ҵ� ȣ��
		System.out.println(result);
	}
}