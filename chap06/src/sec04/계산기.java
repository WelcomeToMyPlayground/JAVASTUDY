package sec04;

public class ���� {
	
	void powerOn() {   // �Է°��� ��� ȣ�⸸ �ϸ� ��
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff(){
		System.out.println("������ ���ϴ�.");
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
	
	// ����: �� �� ���� �ϳ��� 0�̸�, 0�� ȭ��� ����� �� �����ϴ� 
	// ���� -> ���ڿ� String.valueOf();	
	String mul (int x, int y) {			
		if (x == 0 || y == 0) {
			String m = "0�� �Է��� �� �����ϴ�";
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
