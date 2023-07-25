package chap11.sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2명의 이름과 처리코드를 입력 받으세요
		Scanner s = new Scanner(System.in);
		String names[] = new String[2];
		String codes[] = new String[2];
		
		int scores [] = new int[2];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요");
			names[i] = s.next(); // 이름
			System.out.println("처리코드를 입력하세요");
			codes[i] = s.next(); // 처리코드
			scores[i] = Integer.parseInt(codes[i].substring(1)); // ex) c88 이면 8부터 끝까지 잘라서 추출 -> 정수형으로 변환 후 배열에 저장
			
			switch (codes[i].charAt(0)) {
			case 'A':
			case 'a':
				scores[i] *= 1.2 ;		
				break;
			case 'B':
			case 'b':
				scores[i] *= 1.1;			
				break;
			default:
				scores[i] *= 1.05;
			} 
		
			if(scores[i] >= 90) {
				System.out.println(names[i]+"님은 최우수 등급입니다.");
			} else if (scores[i] >= 80) {
				System.out.println(names[i]+"님은 우수 등급입니다.");
			} else {
				System.out.println(names[i]+"님은 일반 등급입니다.");
			}
		}
	}
}
