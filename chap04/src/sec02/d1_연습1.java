package sec02;

public class d1_����1 {

	public static void main(String[] args) {

		// 1���� 100���� ���� �߿��� 3�� ����� ����
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ����: " + sum);

	}

}
