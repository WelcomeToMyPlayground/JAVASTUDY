package sec02;

public class e1_160p_Ȯ�ι���2 {

	public static void main(String[] args) {
		
		// 1~100���� 3�� ����� �հ�
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100���� 3�� ����� ����: " + sum);

	}

}
