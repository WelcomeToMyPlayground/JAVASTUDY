package sec04;

// ����
public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator  myCalc = new Calculator() ;   // �⺻ ������ 
		
		myCalc.println("������");         // ���ϰ� x , ����ȣ�� x (�׳� ȣ���ϸ� �ȴ�)
		
//		myCalc.plus(6, 4);       		  // X
		int result1 = myCalc.plus(6, 4);  // return���� �����ϱ� �޾ƿ;���
		System.out.println(result1);	  // ��� ( ���ϰ� o, ����ȣ�� x)
		
//		myCalc.avg(10, 15);
		double result2 = myCalc.avg(10, 15);  // ���ϰ� o, ����ȣ�� o
		System.out.println(result2);
		
		myCalc.excute();   				 	  //  ���ϰ� x, ����ȣ�� 3�� 
        // void - ���ϰ� ��� ȣ���ϰ� ���� // avg ȣ��, plus ȣ��, println ȣ�� => 3
		
		
	}

}
