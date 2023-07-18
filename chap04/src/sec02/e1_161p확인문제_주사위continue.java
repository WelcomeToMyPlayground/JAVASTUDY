package sec02;

public class e1_161p확인문제_주사위continue {

	public static void main(String[] args) {
		
		// continue 사용하기
		
		while (true) {

			int num = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.printf("주사위 숫자: (%d,%d)", num, num2);

			int sum = num + num2;
			System.out.println("");
			System.out.println("눈의 합: " + sum);

			if (sum != 5) {
				continue;
			} else {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
