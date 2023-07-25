package chap11.sec01;

import java.util.Scanner;

public class SubStringExample퀴즈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이메일을 입력해주세요");
		String email = s.next();
		
		// 예) 12dk545@hanmail.net -> 아이디만 추출해보세요
		int id = email.indexOf("@");
		System.out.println(email.substring(0,id));
		
		// 도메인 추출하기 
		int start = email.indexOf("@"); // 골뱅이 위치값 찾기
		int leng = email.length(); // 전체 글자 개수
		String domain = email.substring(start+1,leng);
		// 골뱅이부터 끝까지 자르기
		System.out.println(domain);
		
		
	}

}
