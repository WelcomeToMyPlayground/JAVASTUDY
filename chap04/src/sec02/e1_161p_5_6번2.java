package sec02;

public class e1_161p_5_6번2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= 1; j--) {
				if (i < j) {
					System.out.print(" "); // 공백 출력
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}

	}
}
