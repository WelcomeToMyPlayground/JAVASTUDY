package sec02;

public class e1_브레이크예제3 {

	public static void main(String[] args) {
		
		// 158p 바깥쪽 반복문까지 종료
		a: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break a; 
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
