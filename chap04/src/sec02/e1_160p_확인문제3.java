package sec02;

public class e1_160p_Ȯ�ι���3 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue; // ���� 3�� ����� �ƴ϶�� ����
			}
			sum += i;
		}
		System.out.println("1 ~ 100���� 3�� ����� ����: " + sum);

	}

}
