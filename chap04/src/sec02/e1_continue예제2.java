package sec02;

public class e1_continue����2 {

	public static void main(String[] args) {
		
		
		//3�� ����̸鼭 5�� ����� ���� ���
		for(int i=1; i <=100; i++) {
			
			if (i % 15 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
