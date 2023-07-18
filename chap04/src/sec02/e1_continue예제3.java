package sec02;

public class e1_continue예제3 {

	public static void main(String[] args) {
		
		// 3의 배수이면서 5의 배수를 출력
		for(int i=1; i <=100; i++) {		// 1부터 100까지 100번 반복
			
			if (i % 3 != 0 || i%5 != 0) {   // 3의 배수가 아니거나 5의 배수가 아니면 생략
				continue;
			}								// => 3의 배수이거나 5의 배수만 ㅇ
			System.out.println(i);
		}
	}

}
