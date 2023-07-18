package sec02;

public class e1_160p_확인문제3 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue; // 만약 3의 배수가 아니라면 생략
			}
			sum += i;
		}
		System.out.println("1 ~ 100까지 3의 배수의 총합: " + sum);

	}

}
