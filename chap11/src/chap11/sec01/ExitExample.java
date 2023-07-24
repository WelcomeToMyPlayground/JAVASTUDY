package chap11.sec01;

public class ExitExample {

	public static void main(String[] args) {
		// 1부터 100까지 짝수만 출력하되 
		// 만약 숫자가 50이 나온다면 중지 System.exit(0);
		// -> 50이 나와서 중지했습니다. 출력
		
		for(int i=2;i<=100; i+=2) {
			System.out.print(i+ " ");
			if(i == 50) {
				System.out.println("50이 나와서 중지했습니다.");
				System.exit(0);
			}
		}
	}

}
