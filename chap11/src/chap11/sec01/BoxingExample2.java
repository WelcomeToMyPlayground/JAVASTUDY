package chap11.sec01;

public class BoxingExample2 {

	public static void main(String[] args) {
		
		// Integer obj = new Integer(100);  ���� �ڵ�
		// ���� ���� int Ÿ���̸� �ڵ����� �ڽ�����
		
		Integer obj = 100;
		System.out.println(obj); // 100 ���
		
		// int value = obj.intValue();  ���� ��ڽ� �ڵ�
		// ���԰���  int Ÿ���̸� �ڵ����� ��ڽ�����
		int value = obj;
		System.out.println(value); // 100 ���
		
		// 
		Integer obj2 = new Integer("100"); // obj2�� Wrapper Ÿ�� Ŭ������
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt�� String Ÿ���� Int Ÿ������ ����
		// obj2�� String Ÿ���� �ƴϹǷ� ��� �Ұ���
		
		int value2 = Integer.valueOf(obj2);
		// valueOf�� �̿��ؾ� ������
		
		int value3 = Integer.parseInt("300");
		System.out.println(value3); // 300 ���
	}  
	
}
