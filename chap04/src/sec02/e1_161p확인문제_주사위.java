package sec02;

public class e1_161pȮ�ι���_�ֻ��� {

	public static void main(String[] args) {

		while (true) {

			int num = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.printf("�ֻ��� ����: (%d,%d)", num, num2);

			int sum = num + num2;
			System.out.println("");
			System.out.println("���� ��: " + sum);

			if (sum == 5) {
				break;

			}

		}
		System.out.println("���α׷� ����");
	}

}
