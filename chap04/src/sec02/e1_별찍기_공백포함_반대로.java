package sec02;

public class e1_�����_��������_�ݴ�� {

	public static void main(String[] args) {

        // �ݴ��
		for (int k = 1; k <= 4; k++) {             // 1,2,3,4 (�� 4��)

			for (int i = 3; i >= k; i--) {         // 
				System.out.print(" ");             // ���� ���
			}
			for (int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
