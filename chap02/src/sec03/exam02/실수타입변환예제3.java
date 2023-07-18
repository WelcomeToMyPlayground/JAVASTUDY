package sec03.exam02;

public class 실수타입변환예제3 {

	public static void main(String[] args) {
		
		char a = '가';
		char b = 1;
		
		int c = a + b;
		
		System.out.println(a);  // 유니코드 출력      
		System.out.println(c);  // 유니코드      
		System.out.println((char)c); //
		
	}

}
