package practice;

import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		
				System.out.println("광주 시립도서관 방문을 환영합니다.");
				Scanner s = new Scanner(System.in);
				int sum = 0; // 대출
				int sum2 = 0; // 반납
				boolean run = true;

				while (run) {
					System.out.println("작업코드와 개수를 입력해주세요.");
					String code = s.next(); // 예) A2, B3, CO

					char a = code.charAt(0); // A는 대출, B는 반납, C는 종료
					char g = code.charAt(1); // 
					int n = Character.getNumericValue(g);

					switch (a) {
					case 'A':
						System.out.println("책 " + n + "권 대출");
						sum += n;
						break;
					case 'B':
						System.out.println("책 " + n + "권 반납");
						sum2 += n;
						break;
					default:
						System.out.println("종료");
						run = false;

					}
				}

				System.out.println("총 대출 권수: " + sum);
				System.out.println("총 반납 권수: " + sum2);

	}

}
