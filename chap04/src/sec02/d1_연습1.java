package sec02;

public class d1_연습1 {

	public static void main(String[] args) {

		// 1부터 100까지 정수 중에서 3의 배수의 총합
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 총합: " + sum);

	}

}
