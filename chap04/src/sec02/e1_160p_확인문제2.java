package sec02;

public class e1_160p_확인문제2 {

	public static void main(String[] args) {
		
		// 1~100까지 3의 배수의 합계
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100까지 3의 배수의 총합: " + sum);

	}

}
