package sec02;

public class e1_별찍기_공백포함_반대로 {

	public static void main(String[] args) {

        // 반대로
		for (int k = 1; k <= 4; k++) {             // 1,2,3,4 (총 4줄)

			for (int i = 3; i >= k; i--) {         // 
				System.out.print(" ");             // 공백 출력
			}
			for (int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
