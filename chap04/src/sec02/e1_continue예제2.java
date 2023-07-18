package sec02;

public class e1_continue예제2 {

	public static void main(String[] args) {
		
		
		//3의 배수이면서 5의 배수인 것을 출력
		for(int i=1; i <=100; i++) {
			
			if (i % 15 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
