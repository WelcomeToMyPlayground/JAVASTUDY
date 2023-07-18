package sec02;

import java.util.Scanner;

public class a7_퀴즈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 관리자 코드는 한글 3글자와 숫자 4개의 조합입니다.
		//홍길동1234 -> 홍길동(아이디) / 1234(비번) 으로 분리
		
		System.out.println("관리자 코드를 입력하세요");
		String code = s.next();
		
		String admin_id = code.substring(0,3); // 시작 인덱스부터 끝 인덱스 앞까지만 추출
		int admin_pass = Integer.parseInt(code.substring(3,7));
		
		System.out.print("아이디: ");
		String name = s.next();
		
		System.out.print("패스워드: ");
		String pass = s.next();
		int password = Integer.parseInt(pass); // 문자열로 받은 pass를 int로 변환
		
		
		if (name.equals(admin_id)) {
			if (password == admin_pass) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} 
		else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}

	}

}
