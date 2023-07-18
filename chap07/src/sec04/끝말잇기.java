package sec04;

import java.util.Scanner;

public class 끝말잇기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다.");
		boolean run = true;

		 System.out.println("게임에 참가하는 인원은 몇 명입니까?");
		int p = s.nextInt(); // ex) 2명
		String[] p1 = new String[p]; // 인원수에 해당하는 String 배열 생성 (개수가 p개인 배열 p1)

		for (int i = 0; i < p1.length; i++) { // 배열 길이만큼 반복
			System.out.print("참가자의 이름을 입력하세요 >>");
			String name = s.next();
			p1[i] = name; // 배열 안에 차례대로 이름을 저장
		}

		// while 시작
		String keyword2 = " ";
		String keyword = " ";
		String word = "아버지";
		System.out.println("시작하는 단어는 " + word);
		
		O:while (true) {

			for (int i = 0; i < p1.length; i++) {
				System.out.print(p1[i] + ">>"); // 배열 안에 들어있는 이름 출력. ex) 홍길동>>

					keyword = s.next(); // 단어 입력
					
					for (int j = 0; j < j; j++) {
						System.out.print(p1[i+1] + ">>");
						keyword2 = s.next(); // 다음 단어 입력
					
						//이게 안 먹힘 
						if (keyword.length() - 1 != keyword2.charAt(0)) {
							
							System.out.println(p1[i+1]+"님이 졌습니다.");
							break O;
						}
					}
					
				}
			} // while 끝
		}
	}

