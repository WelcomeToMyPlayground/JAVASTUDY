package sec01;

import java.util.Scanner;

public class 문자열비교1 {

	public static void main(String[] args) {
		
		String var1 = "홍길동";
		String var2 = "홍길동";
		if (var1 == var2) {
			System.out.println("두 데이터 참조가 같아요");   // true - 출력
		} else {
			System.out.println("두 데이터 참조가 달라요");
		}
		
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		
		if (a == b) {
			System.out.println("두 데이터 참조가 같아요");
		} else {
			System.out.println("두 데이터 참조가 달라요");
		}
		
		// new 연산자 - 객체 생성 연산자 
		// new를 이용하여 String 객체를 만들게 되면 새로운 힙 영역에 저장이 되어 서로 같은 문자열이어도
		// 다른 힙 영역에 저장되기 때문에 다른 스트링 객체로 인식된다
		String var3 = new String("홍길동"); 
		String var4 = new String("홍길동"); 
		if (var3 == var4) {
			System.out.println("두 데이터 참조가 같아요");
		} else {    
			System.out.println("두 데이터 참조가 달라요");
		}
		
		
	}

}
