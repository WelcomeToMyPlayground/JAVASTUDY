package sec02;

public class c1_for����3_3�ǹ�����հ� {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100���� 3�� ����� ��: " + sum);

	}

}
