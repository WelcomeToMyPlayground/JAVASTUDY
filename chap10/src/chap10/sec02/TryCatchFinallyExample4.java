package chap10.sec02;

public class TryCatchFinallyExample4 {

	public static void main(String[] args) {
		
		try {
			//String data1 = args[0];
			//String data2 = args[1];
			
			String data1 = "����";
			String data2 = "�ٶ�";
			
			//String data1 = "123";
			//String data2 = "456";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println("�� ���� ���� : " + result);
		} catch (Exception e) {
			System.out.println("���� �߻� ������!!!");
		}

	}

}