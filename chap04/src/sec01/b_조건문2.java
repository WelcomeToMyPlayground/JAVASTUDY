package sec01;

import java.util.Scanner;

public class b_조건문2 {

	public static void main(String[] args) {

		// 직원 코드는 A부장1234, B과장 4567, C차장9874
		// A 인사부 B 기획부 C 총무부
		// 보너스 금액 부장 100만원, 과장 70만원, 차장 50만원
		// 예) A부장1234 -> 인사부 부장님 보너스금액은 1000000원 입니다.
		// switch구문 2번, charAt(),
		// 문자열 특정 부분 추출 -> substring (1,3) 부장, 과장, 차장
		
		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해 주세요");
		String code = s.next();

		char a = code.charAt(0); // 부서코드
		String b = code.substring(1, 3); // 직급 구하기


		switch (a) {
		case 'A':
		case 'a':
			System.out.print("인사부 " + b + "님 ");
			break;
		case 'B':
		case 'b':
			System.out.print("기획부 " + b + "님 ");
			break;
		default:
			System.out.print("총무부 " + b + "님 ");
		}

		switch (b) {
		case "부장":
			System.out.println("보너스 금액은 100만원입니다.");
			break;
		case "과장":
			System.out.println("보너스 금액은 70만원입니다.");
			break;
		default:
			System.out.println("보너스 금액은 50만원입니다.");
		}
	}

}
