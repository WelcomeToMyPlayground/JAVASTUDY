package chap10.sec01;

public class �������Ϳ���2 {

	public static void main(String[] args) {
		
		String data = null;
		int num = 5;
		
		String b = String.valueOf(num);
		System.out.println(b);
		
		String c = Integer.toString(num);
		System.out.println(c);
		
		// valueOf, toString ��� Object Ÿ���� ���� String���� ��ȯ
		
		// �� toString�� null ó�� �ȵ�
		// Object ��� ���� String �ƴϿ��� ���
		
		// valueOf�� null �� ó����
		// Object ���� String�� �ƴϸ� ��� �ȵ�
	}

}
