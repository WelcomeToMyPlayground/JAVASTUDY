package sec02;

public class e1_continue����3 {

	public static void main(String[] args) {
		
		// 3�� ����̸鼭 5�� ����� ���
		for(int i=1; i <=100; i++) {		// 1���� 100���� 100�� �ݺ�
			
			if (i % 3 != 0 || i%5 != 0) {   // 3�� ����� �ƴϰų� 5�� ����� �ƴϸ� ����
				continue;
			}								// => 3�� ����̰ų� 5�� ����� ��
			System.out.println(i);
		}
	}

}
