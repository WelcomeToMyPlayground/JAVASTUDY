package sec02;

public class e1_continue예제1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {    // 1부터 10까지 10번 반복
			if(i%2 != 0) {     // i가 홀수면 생략
				continue;
			}
			System.out.println(i);
		}

	}

}
