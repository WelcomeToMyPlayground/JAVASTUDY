package sec04;

public class KeyCodeExample2 {

	public static void main(String[] args) throws Exception {
		
		// throws Exception�� ���ܻ�Ȳ�� ȭ�鿡 �����
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("Ű�ڵ� : " + keyCode);
			
			if(keyCode==113)     // Ű�ڵ� ���� 113�̸� �ݺ��� Ż��
				break;
		}
	}
		// while ���� �ݺ�
}
