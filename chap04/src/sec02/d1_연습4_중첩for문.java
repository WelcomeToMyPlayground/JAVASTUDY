package sec02;

public class d1_연습4_중첩for문 {

	public static void main(String[] args) {

		// 2 ~ 9단 출력

		for (int m = 2; m <= 9; m++) {
			System.out.println(m +"단");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m +" x " + n + " = " + (m * n));
			}

		}
	}
}
