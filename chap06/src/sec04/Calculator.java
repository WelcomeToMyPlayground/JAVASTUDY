package sec04;

// Ʋ
public class Calculator {
	
	// 3
	int plus(int x, int y) {        // �հ踦 ���ϴ� �޼ҵ�
		int result = x + y;
		return result;
	}
	// 2
	double avg(int x, int y) {	    // ����� ���ϴ� �޼ҵ�
		double sum = plus(x,y);     // ��ü ���ο��� �հ� �޼ҵ� ȣ��			
		double result = sum / 2;
		return result;
	}

	// 1
	void excute() {
		double result = avg(7, 10);
		println("������: " + result);      // ���ڿ� + ���� = ���ڿ� , println�̶�� �޼ҵ���
	}
	
	// 4
	void println(String message) {
		System.out.println(message);
	}
}
