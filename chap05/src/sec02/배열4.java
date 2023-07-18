package sec02;

import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		int a = s.nextInt();
		System.out.println("두 번째 숫자를 입력해 주세요");
		int b = s.nextInt();
		
	// 타입[] 변수 = new 타입[길이];
		int [] c = new int[2];    // 2개 공간을 가진 int 배열 생성
		c[0] = a;
		c[1] = b;
		// c = new int[] {a,b};    - 한번에 넣기
		
		int sum = c[0] + c[1];
		System.out.println(sum);
		
		for(int i = 0; i < 2; i++) {
			sum += c[i];
		}
		System.out.println(sum);
		
	}

}
