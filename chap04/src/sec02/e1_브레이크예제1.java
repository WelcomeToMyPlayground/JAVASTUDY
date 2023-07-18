package sec02;

public class e1_브레이크예제1 {

	public static void main(String[] args) {
		
		do {
			int num = (int) (Math.random()*6)+1;
			System.out.println(num);
			
			if (num==6) {
				break;
			}
		} while (false);
		
	System.out.println("프로그램 종료");
	}
}
