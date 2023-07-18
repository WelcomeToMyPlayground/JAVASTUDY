package sec02;

public class d1_공백없는별찍기_반대로 {

	public static void main(String[] args) {

		// 별찍기 반대로 
		
		for (int i = 1; i <= 5; i++) {                // 5번 반복
			for (int j = 5; j >= i; j--) {			  // 
				System.out.print("*");

			} 
			System.out.println();
		}
	}
}
