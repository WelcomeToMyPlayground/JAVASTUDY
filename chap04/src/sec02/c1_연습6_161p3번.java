package sec02;

public class c1_����6_161p3�� {

	public static void main(String[] args) {
		// 161p 3��

		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;

		int sum = a + b;

		while (sum != 5) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;

			System.out.printf("(%d , %d)", a, b);

			if (sum == 5) {
				break;
			}

		}
		System.out.printf("(%d , %d)", a, b);
	}

}
