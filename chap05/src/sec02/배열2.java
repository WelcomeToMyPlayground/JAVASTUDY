package sec02;

public class 배열2 {

	public static void main(String[] args) {

//		int[] a;       // 배열 생성
//		int b [];      // 배열 생성                  [] int a; (x)
//		String c [];   // 배열 선언문


		// 배열의 전체 합계와 평균을 구하세요
		// 평균은 double타입

		int d[] = { 52, 87, 94, 77, 69 }; // 배열 선언 및 대입
		int sum = 0;
		

		for (int i = 0; i <= 4; i++) {
			sum += d[i];			
		}
		
		double avg = (double) sum/5;
		System.out.println("배열의 전체 합계: " + sum);
		System.out.println("배열의 전체 평균: " + avg);
	}

}
