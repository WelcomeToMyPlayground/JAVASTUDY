package sec02;

public class d1_별찍기5행10열 {

	public static void main(String[] args) {

		// 출력 예)
		// ********** (5행10열)
		// **********
		// **********
		// **********
		// **********

		int i = 0;
		int j = 0;
		
		for(i =1; i <= 5; i++) {             // 5번 반복
			for(j=1; j <= 10;j++ ) {         // * 을 10번 출력 - print 썼으니 개행x
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
