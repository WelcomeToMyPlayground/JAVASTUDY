package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		
		// throws Exception�� ���ܻ�Ȳ�� ȭ�鿡 �����
		
		int keyCode = System.in.read();
		System.out.println("Ű�ڵ�: " + keyCode);  // �Է� �� �ش��ϴ� Ű�ڵ尡 ��µȴ�
		keyCode = System.in.read();
		System.out.println("Ű�ڵ�: " + keyCode); 
		keyCode = System.in.read();
		System.out.println("Ű�ڵ�: " + keyCode); 
	}

}
