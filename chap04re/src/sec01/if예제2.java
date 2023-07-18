package sec01;

import java.util.Scanner;

public class if예제2 {

	public static void main(String[] args) {

			Scanner s  = new Scanner(System.in);
			
			System.out.println("가수 이름?");
			String name = s.next();
			
			
			if (name.length()==3) {    // 만약 이름이 3글자면 세 번째 글자 출력
				System.out.println(name.charAt(2));
				
			} else {    // 이름이 2글자면 두 번째 글자 출력
				char b  = name.charAt(1);
				System.out.println(b);
			}
			
	}


}
